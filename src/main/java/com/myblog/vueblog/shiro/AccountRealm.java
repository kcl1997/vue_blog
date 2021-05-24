package com.myblog.vueblog.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * 项目名： vueblog
 * 包名:    com.myblog.vueblog.shiro
 * 文件名   AccountRealm
 * 创建者
 * 创建时间: 2021/5/20 6:09 PM
 * 描述  ${TODO}
 */

//@Component
public class AccountRealm extends AuthorizingRealm {

    @Override
    public boolean supports(AuthenticationToken token) {
        return super.supports(token);
    }

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {






        return null;
    }
}

