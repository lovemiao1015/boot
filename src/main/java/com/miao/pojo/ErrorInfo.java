package com.miao.pojo;

import lombok.Data;

/**
 * Created by skf
 * Date 2017/10/31.
 */
@Data
public class ErrorInfo<T> {

    public static final Integer OK = 0;
    public static final Integer ERROR = 100;
    private Integer code;
    private String message;
    private String url;
    private T data;
    // 省略getter和setter
}