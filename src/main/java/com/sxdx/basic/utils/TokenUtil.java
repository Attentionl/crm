package com.sxdx.basic.utils;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author chenwei
 * @date 2020/2/5 1:52 下午
 **/
@Component
public class TokenUtil {

@Resource
RedisTemplate<String,Object> redisTemplate;

    public  String createToken(String userId) {
        String token = UUID.randomUUID().toString().replaceAll("-", "");
        redisTemplate.opsForValue().set(token,userId);
        return token;
    }

    public boolean isTokenValid(String token) {
        ValueOperations<String,Object> vo = redisTemplate.opsForValue();
        String o = (String) vo.get(token);
        if(o!=null){
            System.out.println(o);
            return true;
        }
        return false;
    }
    public  void deleteToken(String token) {
         redisTemplate.delete(token);
    }

    public  String getUserIdByToken(String token)
    {
        ValueOperations<String, Object> vo = redisTemplate.opsForValue();
        return (String) vo.get(token);

    }
}
