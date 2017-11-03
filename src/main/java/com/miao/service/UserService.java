package com.miao.service;

import com.miao.pojo.User;

import java.util.List;
import java.util.zip.ZipFile;

/**
 * Created by skf
 * Date 2017/10/31.
 */
public interface UserService {

    User findByName(String name);

    void save(User user);

    List<User> findAll();

    User findOne(long l);

    void delete(User u);
}
