package com.miao.dao;

import com.miao.pojo.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by skf
 * Date 2017/10/31.
 */
public interface UserRepository extends MongoRepository<User,Long> {

    User findByName(String name);
}
