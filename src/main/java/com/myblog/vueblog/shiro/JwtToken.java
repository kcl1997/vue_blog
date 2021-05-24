package com.myblog.vueblog.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * 项目名： vueblog
 * 包名:    com.myblog.vueblog.shiro
 * 文件名   JwtToken
 * 创建者
 * 创建时间: 2021/5/24 5:40 PM
 * 描述  ${TODO}
 */
public class JwtToken implements AuthenticationToken {

    private String token;

    public  JwtToken(String token){
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}

