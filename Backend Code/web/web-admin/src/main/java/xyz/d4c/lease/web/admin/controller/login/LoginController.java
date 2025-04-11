package xyz.d4c.lease.web.admin.controller.login;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import xyz.d4c.lease.common.context.LoginUser;
import xyz.d4c.lease.common.context.LoginUserContext;
import xyz.d4c.lease.common.result.Result;
import xyz.d4c.lease.common.utils.JwtUtil;
import xyz.d4c.lease.model.entity.SystemUser;
import xyz.d4c.lease.web.admin.service.LoginService;
import xyz.d4c.lease.web.admin.service.SystemUserService;
import xyz.d4c.lease.web.admin.vo.login.CaptchaVo;
import xyz.d4c.lease.web.admin.vo.login.LoginVo;
import xyz.d4c.lease.web.admin.vo.system.user.SystemUserInfoVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name = "后台管理系统登录管理")
@RestController
@RequestMapping("/admin")
public class LoginController {
    @Autowired
    private LoginService service;

    @Autowired
    private SystemUserService systemUserService;

    @Operation(summary = "获取图形验证码")
    @GetMapping("login/captcha")
    public Result<CaptchaVo> getCaptcha() {
        CaptchaVo captcha = service.getCaptcha();
        return Result.ok(captcha);
    }

    @Operation(summary = "登录")
    @PostMapping("login")
    public Result<String> login(@RequestBody LoginVo loginVo) {
        String token = service.login(loginVo);
        /*Thread.sleep(100);*/
        return Result.ok(token);
    }

    @Operation(summary = "获取登陆用户个人信息")
    @GetMapping("info")
    public Result<SystemUserInfoVo> info() {
        SystemUser systemUser = systemUserService.getById(LoginUserContext.getLoginUser().getUserId());
        SystemUserInfoVo systemUserInfoVo = new SystemUserInfoVo();
        systemUserInfoVo.setName(systemUser.getUsername());
        systemUserInfoVo.setAvatarUrl(systemUser.getAvatarUrl());
        return Result.ok(systemUserInfoVo);
    }
}