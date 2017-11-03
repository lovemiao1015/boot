package com.miao.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by skf
 * Date 2017/11/3.
 */
@NoArgsConstructor
@Data
@Document(collection = "user")
public class User1 {
    private String id;
    private String name;
    private Integer age;
}
