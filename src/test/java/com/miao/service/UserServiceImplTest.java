package com.miao.service;

import com.miao.pojo.User;
import com.miao.pojo.User1;
import com.miao.properties.MiaoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by skf
 * Date 2017/10/31.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MiaoApplication.class)
public class UserServiceImplTest {

    @Autowired
    private UserService userService;
    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void findByUsername() throws Exception {

        List<User> all = mongoTemplate.findAll(User.class);
        System.out.println(all);
        // 创建三个User，并验证User总数
//        userService.save(new User(null, "didi", 30));
//        userService.save(new User(null, "mama", 40));
//        userService.save(new User(null, "kaka", 50));
//        System.out.println(userService.findAll());
//        Assert.assertEquals(3, userService.findAll().size());
//        // 删除一个User，再验证User总数
//        User u = userService.findOne(1L);
//        userService.delete(u);
//        Assert.assertEquals(2, userService.findAll().size());
//        // 删除一个User，再验证User总数
//        u = userService.findByUsername("mama");
//        userService.delete(u);
//        Assert.assertEquals(1, userService.findAll().size());
//        User zhangsan = userService.findByUsername("zhangsan");
//        System.out.println(zhangsan);
    }

}