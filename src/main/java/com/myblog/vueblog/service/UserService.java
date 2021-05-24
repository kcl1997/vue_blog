package com.myblog.vueblog.service;

import com.myblog.vueblog.dao.UserDao;
import com.myblog.vueblog.pojo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 项目名： vueblog
 * 包名:    com.myblog.vueblog.service
 * 文件名   UserService
 * 创建者
 * 创建时间: 2021/5/20 3:30 PM
 * 描述  ${TODO}
 */


@Service
public class UserService {



    @Autowired
    UserDao mUserDao;

    public User getKcl(){
        return mUserDao.getKcl();
    }
}

