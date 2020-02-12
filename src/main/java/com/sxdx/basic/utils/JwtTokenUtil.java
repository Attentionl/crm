package com.sxdx.basic.utils;

import com.sxdx.basic.exception.UnAuthorizedException;
import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Base64;
import java.util.Date;

/**
 * @author 李今朝
 * @className JwtTokenUtil
 * @version1.0
 * @description 使用jwt来创建token
 * @createdTime 2020/2/12 21:50
 */
public class JwtTokenUtil {

    private static Logger log = LoggerFactory.getLogger(JwtTokenUtil.class);

    public static final String AUTH_HEADER_KEY = "Authorization";

    public static final String BASE64_SECRET = Base64.getEncoder().encodeToString("crm".getBytes());
    private static final int EXPIRE_SECONDS = 60 * 60 * 24;

    /**
     * @param userId
     * @param username
     * @name: createJWT
     * @description: TODO 生成token
     * @return: java.lang.String
     * @date: 2020/2/12 22:17
     * @auther: 李今朝
     */
    public static String createJWT(Integer userId, String username) {
        try {
            Date now = new Date();
            //添加构成JWT的参数
            JwtBuilder builder = Jwts.builder().setHeaderParam("typ", "JWT")
                    // 可以将基本不重要的对象信息放到claims
                    .claim("userId", userId)
                    // 代表这个JWT的主体，即它的用户名
                    .setSubject(username)
                    // 代表这个JWT的签发主体
                    .setIssuer("李今朝")
                    // 代表这个JWT的签发时间
                    .setIssuedAt(new Date())
                    .signWith(SignatureAlgorithm.HS256, BASE64_SECRET)
                    .setNotBefore(new Date())
                    .setExpiration(new Date(System.currentTimeMillis() + EXPIRE_SECONDS));
            //生成JWT
            return builder.compact();
        } catch (Exception e) {
            log.error("签名失败", e);
            throw new UnAuthorizedException("签名失败");
        }
    }

    /**
     * @param token
     * @name: parseJWT
     * @description: TODO 用来解析jwt生成的token
     * @return: io.jsonwebtoken.Claims
     * @date: 2020/2/12 21:59
     * @auther: 李今朝
     */
    public static Claims parseJWT(String token) {
        try {
            Claims claims = Jwts.parser().setSigningKey(BASE64_SECRET).parseClaimsJws(token).getBody();
            return claims;
        } catch (ExpiredJwtException e) {
            log.error("===== Token过期 =====", e);
            throw new UnAuthorizedException("token过期");
        } catch (Exception e) {
            log.error("===== token解析异常 =====", e);
            throw new UnAuthorizedException("token解析异常");
        }
    }

    /**
     * @param token
     * @name: getUsername
     * @description: TODO 从token中获取用户名
     * @return: java.lang.String
     * @date: 2020/2/12 22:20
     * @auther: 李今朝
     */
    public static String getUsername(String token) {
        return parseJWT(token).getSubject();
    }

    /**
     * @param token
     * @name: getUserId
     * @description: TODO 从token中获取用户ID
     * @return: java.lang.String
     * @date: 2020/2/12 22:22
     * @auther: 李今朝
     */
    public static Integer getUserId(String token) {
        return parseJWT(token).get("userId", Integer.class);
    }

    /**
     * @param token
     * @name: isExpiration
     * @description: TODO token是否已过期
     * @return: boolean
     * @date: 2020/2/12 22:23
     * @auther: 李今朝
     */
    public static boolean isExpiration(String token) {
        return parseJWT(token).getExpiration().before(new Date());
    }
}

