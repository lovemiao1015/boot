package com.miao.service;

import com.miao.dao.UserRepository;
import com.miao.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.zip.ZipFile;

/**
 * Created by skf
 * Date 2017/10/31.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void save(User user) {
            userRepository.save(user);
    }

    @Override
    public ZipFile findAll() {
        return null;
    }

    @Override
    public User findOne(long l) {
        return null;
    }

    @Override
    public void delete(User u) {

    }
}
