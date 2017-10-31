package com.miao.service;

import com.miao.pojo.User;

import java.util.zip.ZipFile;

/**
 * Created by skf
 * Date 2017/10/31.
 */
public interface UserService {

    User findByUsername(String username);

    void save(User user);

    ZipFile findAll();

    User findOne(long l);

    void delete(User u);
}
