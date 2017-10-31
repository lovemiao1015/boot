package com.miao.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.miao"})
public class MiaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiaoApplication.class, args);
	}
}
