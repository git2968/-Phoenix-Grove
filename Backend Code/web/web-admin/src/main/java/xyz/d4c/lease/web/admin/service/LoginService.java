package xyz.d4c.lease.web.admin.service;

import xyz.d4c.lease.web.admin.vo.login.CaptchaVo;
import xyz.d4c.lease.web.admin.vo.login.LoginVo;
import xyz.d4c.lease.web.admin.vo.system.user.SystemUserInfoVo;

public interface LoginService {

    CaptchaVo getCaptcha();


    String login(LoginVo loginVo);
}
