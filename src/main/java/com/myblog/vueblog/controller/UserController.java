package com.myblog.vueblog.controller;

import com.myblog.vueblog.pojo.Result;
import com.myblog.vueblog.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 项目名： vueblog
 * 包名:    com.myblog.vueblog.controller
 * 文件名   UserController
 * 创建者
 * 创建时间: 2021/5/20 3:26 PM
 * 描述  ${TODO}
 */

@Controller
public class UserController {


    @Autowired
    UserService mUserService;

    @RequestMapping("/kcl")
    @ResponseBody
    public Result getKcl(){

        return Result.success(mUserService.getKcl());
    }

}

