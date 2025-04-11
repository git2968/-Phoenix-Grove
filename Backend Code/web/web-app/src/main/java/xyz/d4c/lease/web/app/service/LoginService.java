package xyz.d4c.lease.web.app.service;

import xyz.d4c.lease.web.app.vo.user.LoginVo;
import xyz.d4c.lease.web.app.vo.user.UserInfoVo;

public interface LoginService {


    void getSMSCode(String phone);

    String login(LoginVo loginVo);

    UserInfoVo getUserInfoId(Long id);
}
