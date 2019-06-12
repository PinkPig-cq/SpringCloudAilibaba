package com.hpeu.userprovider.userprovider.service.Impl;

import com.hpeu.userprovider.userprovider.dao.userMapper;
import com.hpeu.pojo.Users;
import com.hpeu.userprovider.userprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@CacheConfig(cacheManager = "redisCacheManager",cacheNames = "user")
public class UserServiceImpl implements UserService {
    @Autowired
    userMapper userMapper;
    @Override
    @Cacheable(key = "user_list",unless = "#result == null")
    public List<Users> findAll() {
        return userMapper.findAll();
    }

    @Override
    @Cacheable(key = "#root.args[0]",unless = "#result == null")
    public Users findById(int id) {
        return userMapper.findById(id);
    }

    @CacheEvict(key = "all_list",allEntries = true)
    public void addUser(){
        // todo
        //添加用户的时候  会删除 all_list 中的所以信息
    }

    @CachePut(key = "#root.args[0].id")
    public Users update(Users users){
        //todo
        //修改的时候 会更新Key为Id的换成  同前面的findById 是使用同一个
        return null;
    }
}
