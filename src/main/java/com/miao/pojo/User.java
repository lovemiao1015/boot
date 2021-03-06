package com.miao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by skf
 * Date 2017/10/31.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "user")
public class User {

    private String id;
    private String name;
    private Integer age;
}
