package com.hpeu.userprovider.userprovider;

import com.hpeu.userprovider.userprovider.dao.userMapper;
import com.hpeu.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserproviderApplicationTests {
    @Autowired
    userMapper userMapper;

    @Test
    public void contextLoads() {
        Users users = userMapper.findById(1);
        System.out.println(users);
    }

}
