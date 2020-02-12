package com.sxdx;

import com.sxdx.basic.utils.JwtTokenUtil;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Base64;
import java.util.Date;

@SpringBootTest
class CrmApplicationTests {

    /**
     * @name: contextLoads
     * @description: TODO 测试生成jwt token
     * @return: void
     * @date: 2020/2/12 20:49
     * @auther: 李今朝
     */
    @Test
    void contextLoads() {
        String compact = Jwts.builder().setId("李今朝").setIssuedAt(new Date()).setSubject("Today").setExpiration(new Date(System.currentTimeMillis() + (1000 * 3))).signWith(SignatureAlgorithm.HS256, "haha").compact();
        System.out.println(compact);

        String token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiLmnY7ku4rmnJ0iLCJpYXQiOjE1ODE1MTE5ODcsInN1YiI6IlRvZGF5In0.KkPkBAp9y9Ge9fr3P1Mg4Ntf2vwFClUTaXALi1STVYE";

        Claims claims = Jwts.parser().setSigningKey("haha").parseClaimsJws(token).getBody();
        System.out.println(claims);

    }

    @Test
    void deCode() {
        String code = "eyJqdGkiOiLmnY7ku4rmnJ0iLCJpYXQiOjE1ODE1MTE1NTMsInN1YiI6IlRvZGF5In0";
        String code1 = "eyJhbGciOiJIUzI1NiJ9";
        byte[] decode = Base64.getDecoder().decode(code1);
        System.out.println(new String(decode));
    }

    @Test
    void testCreateJwt(){
        String token = JwtTokenUtil.createJWT(110, "李今朝");
        System.out.println(token);

        System.out.println("============================");
        Claims claims = JwtTokenUtil.parseJWT(token);
        System.out.println(claims);
        System.out.println("============================");
        System.out.println(JwtTokenUtil.getUserId(token));
        System.out.println(JwtTokenUtil.getUsername(token));
        System.out.println(JwtTokenUtil.isExpiration(token));

    }

}
