package com.myblog.vueblog.pojo;

import java.math.BigInteger;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 项目名： vueblog
 * 包名:    com.myblog.vueblog.pojo
 * 文件名   Blog
 * 创建者
 * 创建时间: 2021/5/20 3:14 PM
 * 描述  ${TODO}
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    private BigInteger id;
    private BigInteger userId;

    private String title;
    private String description;
    private String content;

    private Integer status;
    private Timestamp createdTime;
}

