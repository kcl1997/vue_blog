package com.myblog.vueblog.dao;

import com.myblog.vueblog.pojo.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 项目名： vueblog
 * 包名:    com.myblog.vueblog.dao
 * 文件名   UserDao
 * 创建者
 * 创建时间: 2021/5/20 3:29 PM
 * 描述  ${TODO}
 */


@Mapper
public interface UserDao {

    @Select("select * from m_user where id = 1")
    User getKcl();

}
