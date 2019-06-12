package com.hpeu.userconsumer.controller;

import com.hpeu.pojo.Users;
import com.hpeu.userconsumer.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("index/getuser/{id}")
    @ResponseBody
    public Users index(@PathVariable("id") int id){
        return userService.index(id);
    }
}
