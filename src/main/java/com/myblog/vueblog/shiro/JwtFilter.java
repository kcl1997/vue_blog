package com.myblog.vueblog.shiro;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.filter.authc.AuthenticatingFilter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * 项目名： vueblog
 * 包名:    com.myblog.vueblog.filters
 * 文件名   JwtFilter
 * 创建者
 * 创建时间: 2021/5/24 5:31 PM
 * 描述  类似于 anon  authc 过滤器
 */


@Component
public class JwtFilter extends AuthenticatingFilter { // Authentication有executeLogin方法 ->create UsernamePasswordToken
    @Override
    protected AuthenticationToken createToken(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {


        // ?????
        String jwt = ((HttpServletRequest) servletRequest).getHeader("Authorization");
        if(StringUtils.isEmpty(jwt))
            return null;


        return new JwtToken(jwt);  // -> AccountRealm -> doGetAuthenticationInfo(AuthenticationToken authenticationToken)

    }

    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        return false;
    }
}

