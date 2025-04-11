package xyz.d4c.lease.common.utils;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import xyz.d4c.lease.common.exception.LeaseException;
import xyz.d4c.lease.common.result.ResultCodeEnum;

import javax.crypto.SecretKey;
import java.util.Date;

public class JwtUtil {
    private static long tokenExpiration = 60 * 60 * 1000L;
    private static SecretKey tokenSignKey = Keys.hmacShaKeyFor("K9piW8L842eLg1BWFMKU9wUumzF94ZZq".getBytes());

    //生成token
    public static String createToken(Long userId, String username) {
        String token = Jwts.builder()
                //头
                .setHeaderParam("alg", "HS256")
                .setHeaderParam("typ", "JWT")
                //负载
                .setSubject("USER_INFO")
                .setExpiration(new Date(System.currentTimeMillis() + tokenExpiration))
                .claim("userId", userId)
                .claim("username", username)
                //签名
                .signWith(tokenSignKey, SignatureAlgorithm.HS256)
                //连接
                .compact();
        return token;
    }

    //解析token
    public static Claims parseToken(String token) {
        try {
            Jws<Claims> claimsJws = Jwts.parserBuilder().
                    setSigningKey(tokenSignKey).
                    build().parseClaimsJws(token);

            /*JwsHeader header = claimsJws.getHeader();
            String algorithm = header.getAlgorithm();
            String type = header.getType();
            System.out.println(algorithm);
            System.out.println(type);*/

            return claimsJws.getBody();

        } catch (ExpiredJwtException e) {
            throw new LeaseException(ResultCodeEnum.TOKEN_EXPIRED);
        } catch (JwtException e) {
            throw new LeaseException(ResultCodeEnum.TOKEN_INVALID);
        }
    }
}
