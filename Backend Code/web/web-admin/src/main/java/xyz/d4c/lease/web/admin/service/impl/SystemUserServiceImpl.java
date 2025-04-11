package xyz.d4c.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import xyz.d4c.lease.model.entity.SystemPost;
import xyz.d4c.lease.model.entity.SystemUser;
import xyz.d4c.lease.model.enums.BaseStatus;
import xyz.d4c.lease.web.admin.mapper.SystemUserMapper;
import xyz.d4c.lease.web.admin.service.SystemPostService;
import xyz.d4c.lease.web.admin.service.SystemUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import xyz.d4c.lease.web.admin.vo.system.user.SystemUserItemVo;
import xyz.d4c.lease.web.admin.vo.system.user.SystemUserQueryVo;

/**
 * @author liubo
 * @description 针对表【system_user(员工信息表)】的数据库操作Service实现
 * @createDate 2023-07-24 15:48:00
 */
@Service
public class SystemUserServiceImpl extends ServiceImpl<SystemUserMapper, SystemUser>
        implements SystemUserService {
    @Autowired
    private SystemUserMapper systemUserMapper;

    @Autowired
    private SystemPostService systemPostService;

    @Override
    public IPage<SystemUserItemVo> pageSystemUserByQuery(IPage<SystemUser> page, SystemUserQueryVo queryVo) {
        return systemUserMapper.pageSystemUserByQuery(page, queryVo);
    }

    @Override
    public SystemUserItemVo getSystemUserById(Long id) {
        return systemUserMapper.getSystemUserById(id);
    }

    @Override
    public void updateStatusByUserId(Long id, BaseStatus status) {
        systemUserMapper.updateStatusByUserId(id, status);
    }

    @Override
    public boolean saveOrUpdateWithCheck(SystemUser systemUser) {
        // 用户名校验
        LambdaQueryWrapper<SystemUser> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SystemUser::getUsername, systemUser.getUsername());
        if (systemUser.getId() != null) {
            queryWrapper.ne(SystemUser::getId, systemUser.getId());
        }
        if (this.count(queryWrapper) > 0) {
            return false; // 用户名重复，直接返回 false
        }

        // 密码加密（仅在密码非空时加密）
        if (StringUtils.isNotBlank(systemUser.getPassword())) {
            systemUser.setPassword(DigestUtils.sha256Hex(systemUser.getPassword()));
        }

        // 执行保存或更新操作，直接返回 MyBatis-Plus 的布尔结果
        return this.saveOrUpdate(systemUser);
    }


}




