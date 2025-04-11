package xyz.d4c.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wf.captcha.SpecCaptcha;
import com.wf.captcha.base.Captcha;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.StringUtils;
import xyz.d4c.lease.common.constant.RedisConstant;
import xyz.d4c.lease.common.exception.LeaseException;
import xyz.d4c.lease.common.result.ResultCodeEnum;
import xyz.d4c.lease.common.utils.JwtUtil;
import xyz.d4c.lease.model.entity.SystemUser;
import xyz.d4c.lease.model.enums.BaseStatus;
import xyz.d4c.lease.web.admin.mapper.SystemUserMapper;
import xyz.d4c.lease.web.admin.service.LoginService;
import org.springframework.stereotype.Service;
import xyz.d4c.lease.web.admin.vo.login.CaptchaVo;
import xyz.d4c.lease.web.admin.vo.login.LoginVo;

import java.util.UUID;
import java.util.concurrent.TimeUnit;


@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private SystemUserMapper systemUserMapper;


    @Override
    public CaptchaVo getCaptcha() {
        SpecCaptcha specCaptcha = new SpecCaptcha(130, 48, 4);
        specCaptcha.setCharType(Captcha.TYPE_DEFAULT);

        String code = specCaptcha.text().toLowerCase();
        String key = RedisConstant.ADMIN_LOGIN_PREFIX + UUID.randomUUID();
        String image = specCaptcha.toBase64();
        redisTemplate.opsForValue().set(key, code, RedisConstant.ADMIN_LOGIN_CAPTCHA_TTL_SEC, TimeUnit.SECONDS);

        return new CaptchaVo(image, key);
    }

    @Override
    public String login(LoginVo loginVo) {
        if (!StringUtils.hasText(loginVo.getCaptchaCode())) {
            throw new LeaseException(ResultCodeEnum.ADMIN_CAPTCHA_CODE_NOT_FOUND);
        }
        if (!StringUtils.hasText(loginVo.getUsername())) {
            throw new LeaseException(ResultCodeEnum.ADMIN_USERNAME_NOT_FOUND);
        }
        if (!StringUtils.hasText(loginVo.getPassword())) {
            throw new LeaseException(ResultCodeEnum.AdMIN_PASSWORD_NOT_FOUND);
        }
        if (!StringUtils.hasText(loginVo.getCaptchaKey())) {
            throw new LeaseException(ResultCodeEnum.SERVICE_ERROR);
        }

        String captchaKey =loginVo.getCaptchaKey();
        String code = redisTemplate.opsForValue().get(captchaKey);
        if(code==null){
            throw new LeaseException(ResultCodeEnum.ADMIN_CAPTCHA_CODE_EXPIRED);
        }
        if(!code.equals(loginVo.getCaptchaCode().toLowerCase())){
            throw new LeaseException(ResultCodeEnum.ADMIN_CAPTCHA_CODE_ERROR);
        }

        LambdaQueryWrapper<SystemUser> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SystemUser::getUsername, loginVo.getUsername());
        SystemUser systemUser = systemUserMapper.selectOne(queryWrapper);
        if (systemUser == null){
            throw new LeaseException(ResultCodeEnum.ADMIN_ACCOUNT_ERROR);
        }

        if(systemUser.getStatus()== BaseStatus.DISABLE){
            throw new LeaseException(ResultCodeEnum.ADMIN_ACCOUNT_DISABLED_ERROR);
        }
        if(!systemUser.getPassword().equals(DigestUtils.sha256Hex(loginVo.getPassword()))){
            throw new LeaseException(ResultCodeEnum.ADMIN_ACCOUNT_ERROR);
        }
        String token = JwtUtil.createToken(systemUser.getId(), systemUser.getUsername());
        return token;
    }


}
