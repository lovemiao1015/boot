package com.miao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by skf
 * Date 2017/10/31.
 */
@Data
@AllArgsConstructor
public class User {

    private Long id;
    private String name;
    private Integer age;
}
