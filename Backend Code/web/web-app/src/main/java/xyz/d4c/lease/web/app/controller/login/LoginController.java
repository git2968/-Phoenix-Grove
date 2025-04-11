package xyz.d4c.lease.web.app.controller.login;



import xyz.d4c.lease.common.context.LoginUserContext;
import xyz.d4c.lease.common.result.Result;
import xyz.d4c.lease.web.app.service.LoginService;
import xyz.d4c.lease.web.app.vo.user.LoginVo;
import xyz.d4c.lease.web.app.vo.user.UserInfoVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "登录管理")
@RequestMapping("/app/")
public class LoginController {
    @Autowired
    private LoginService service;

    @GetMapping("login/getCode")
    @Operation(summary = "获取短信验证码")
    public Result getCode(@RequestParam String phone) {
        service.getSMSCode(phone);
        return Result.ok();
    }

    @PostMapping("login")
    @Operation(summary = "登录")
    public Result<String> login(@RequestBody LoginVo loginVo) {
        String token = service.login(loginVo);
        return Result.ok(token);
    }

    @GetMapping("info")
    @Operation(summary = "获取登录用户信息")
    public Result<UserInfoVo> info() {
        UserInfoVo info = service.getUserInfoId(LoginUserContext.getLoginUser().getUserId());
        return Result.ok(info);
    }
}
