package com.hpeu.userprovider.userprovider.service;

import com.hpeu.pojo.Users;

import java.util.List;

public interface UserService {
    List<Users> findAll();
    Users findById(int id);
}
