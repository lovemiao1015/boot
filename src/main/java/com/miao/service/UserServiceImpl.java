package com.miao.service;

import com.miao.dao.UserRepository;
import com.miao.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.zip.ZipFile;

/**
 * Created by skf
 * Date 2017/10/31.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public void save(User user) {
            userRepository.save(user);
    }

    @Override
    public List<User> findAll()
    {
        List<User> list = userRepository.findAll();
        return list;
    }

    @Override
    public User findOne(long l)
    {
        User one = userRepository.findOne(l);
        return one;
    }

    @Override
    public void delete(User u) {
        userRepository.delete(u);
    }
}
