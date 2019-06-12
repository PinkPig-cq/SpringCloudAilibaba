package com.hpeu.userprovider.userprovider.controller;

import com.hpeu.pojo.Users;
import com.hpeu.userprovider.userprovider.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/index/{id}")
    public Users index(@PathVariable("id") int id){
        Users users = userService.findById(id);
        if (users == null)
            throw new NullPointerException();
        return users;
    }
}
