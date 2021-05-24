package com.myblog.vueblog.config;

import com.myblog.vueblog.shiro.JwtFilter;
import com.myblog.vueblog.shiro.AccountRealm;

import org.apache.commons.collections.map.HashedMap;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;

/**
 * 项目名： vueblog
 * 包名:    com.myblog.vueblog.config
 * 文件名   ShiroConfig
 * 创建者
 * 创建时间: 2021/5/20 4:51 PM
 * 描述  ${TODO}
 */


@Configuration
public class ShiroConfig {

    @Autowired
    JwtFilter mJwtFilter;


    // 1.创建自定义realm
    @Bean
    public Realm getAccountRealm(){
        return new AccountRealm();
    }

    // 2.创建安全管理器
    @Bean
    public DefaultWebSecurityManager getSecurityManager(@Qualifier("getAccountRealm") Realm realm){
       return new DefaultWebSecurityManager(realm);
    }

    // 3.创建shiro拦截工厂实例
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("getSecurityManager") DefaultWebSecurityManager defaultWebSecurityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(defaultWebSecurityManager);
        shiroFilterFactoryBean.setLoginUrl("/user/login");  //默认登录路径

        //配置拦截路径
        Map<String,String> map = new HashMap<>();
        map.put("/user/login","anon"); //公共
        map.put("/kcl","anon"); //公共
        map.put("/**","jwtFilter"); //所有的都需要经过jwt过滤器
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);


        //设置拦截器
        Map<String, Filter> filters = new HashedMap();
        filters.put("jwtFilter", mJwtFilter);
        shiroFilterFactoryBean.setFilters(filters);



        return shiroFilterFactoryBean;
    }


}

