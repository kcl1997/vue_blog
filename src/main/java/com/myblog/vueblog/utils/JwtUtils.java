package com.myblog.vueblog.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Calendar;
import java.util.Map;
import java.util.Set;

/**
 * 项目名： vueblog
 * 包名:    com.myblog.vueblog.utils
 * 文件名   JwtUtils
 * 创建者
 * 创建时间: 2021/5/24 4:41 PM
 * 描述  ${TODO}
 */
public class JwtUtils {
    private static final String MIYAO = "mymiyao";


    //根据传递的键值对 + 密钥 + 算法 -> 生成 数字签名 --> 组成token
    public static String getToken(Map<String, String> map) {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DATE, 7); // 7天

        JWTCreator.Builder builder = JWT.create();
        Set<String> keySet = map.keySet();
        for (String key : keySet)
            builder.withClaim(key, map.get(key));
        String token = builder.withExpiresAt(instance.getTime())
                .sign(Algorithm.HMAC256(MIYAO));
        return token;
    }

    //验证token合法性，异常上层捕获
    //验证成功就返回decodeJWT
    public static DecodedJWT verify(String token) {
        DecodedJWT decodedJWT = JWT.require(Algorithm.HMAC256(MIYAO)).build().verify(token);
        return decodedJWT;
    }

}