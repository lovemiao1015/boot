package com.miao.service;

import com.miao.pojo.User;
import com.miao.properties.MiaoApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by skf
 * Date 2017/10/31.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MiaoApplication.class)
public class UserServiceImplTest {

    @Autowired
    private UserService userService;
    @Test
    public void findByUsername() throws Exception {

        // 创建三个User，并验证User总数
        userService.save(new User(1L, "didi", 30));
        userService.save(new User(2L, "mama", 40));
        userService.save(new User(3L, "kaka", 50));
        Assert.assertEquals(3, userService.findAll().size());
        // 删除一个User，再验证User总数
        User u = userService.findOne(1L);
        userService.delete(u);
        Assert.assertEquals(2, userService.findAll().size());
        // 删除一个User，再验证User总数
        u = userService.findByUsername("mama");
        userService.delete(u);
        Assert.assertEquals(1, userService.findAll().size());
        User zhangsan = userService.findByUsername("zhangsan");
        System.out.println(zhangsan);
    }

}