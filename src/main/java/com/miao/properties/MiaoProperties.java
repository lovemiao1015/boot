package com.miao.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by skf
 * Date 2017/10/31.
 */
@Component
@Data
public class MiaoProperties {

    @Value("${com.boot.miao.name}")
    private String name;
    @Value("${com.boot.miao.title}")
    private String title;
}
