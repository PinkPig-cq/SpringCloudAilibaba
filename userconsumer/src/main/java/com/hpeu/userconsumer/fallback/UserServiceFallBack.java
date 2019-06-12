package com.hpeu.userconsumer.fallback;

import com.hpeu.pojo.Users;
import com.hpeu.userconsumer.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFallBack implements UserService {
    @Override
    public Users index(int id) {
        Users users = new Users();
        users.setId(id);
        users.setClassesId("没有找的这个ID的信息");
        return users;
    }
}
