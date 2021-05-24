package com.myblog.vueblog.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 项目名： vueblog
 * 包名:    com.myblog.vueblog.pojo
 * 文件名   Result
 * 创建者
 * 创建时间: 2021/5/20 3:58 PM
 * 描述  ${TODO}
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    private int code; //200正常，其他表示异常
    private String msg;
    private Object data;

    // 静态方法直接调用，不需要new Object
    // 传递数据Obj，封装成Result对象
    // 附带code和msg
    public static Result success(int code,String msg,Object data){
        Result res = new Result(code,msg,data);
        return res;
    }
    // 成功重载
    public static Result success(Object data){
        return success(200,"操作成功",data);
    }


    // 失败
    public static Result failure(int code,String msg,Object data){
        Result r = new Result(code,msg,data);
        return r;
    }
    //失败重载 信息+数据
    public static Result failure(String msg,Object data){
        return failure(400,msg,data);
    }
    //失败重载  信息
    public static Result failure(String msg){
        return failure(400,msg,null);
    }

}

