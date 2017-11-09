package com.miao.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class}
@SpringBootApplication()
@ComponentScan(basePackages = {"com.miao"})
@EnableMongoRepositories(basePackages = "com.miao.dao")
public class MiaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiaoApplication.class, args);
	}
}
