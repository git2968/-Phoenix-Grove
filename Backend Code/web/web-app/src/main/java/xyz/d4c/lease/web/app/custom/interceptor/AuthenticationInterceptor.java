package xyz.d4c.lease.web.app.custom.interceptor;

import io.jsonwebtoken.Claims;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import xyz.d4c.lease.common.context.LoginUser;
import xyz.d4c.lease.common.context.LoginUserContext;
import xyz.d4c.lease.common.exception.LeaseException;
import xyz.d4c.lease.common.result.ResultCodeEnum;
import xyz.d4c.lease.common.utils.JwtUtil;

@Component
public class AuthenticationInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String token = request.getHeader("access_token");

        if (!StringUtils.hasText(token)) {
            throw new LeaseException(ResultCodeEnum.APP_LOGIN_AUTH);
        } else {
            Claims claims = JwtUtil.parseToken(token);
            Long userId = claims.get("userId", Long.class);
            String username = claims.get("username", String.class);
            LoginUserContext.setLoginUser(new LoginUser(userId, username));
        }
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        LoginUserContext.clear();
    }
}