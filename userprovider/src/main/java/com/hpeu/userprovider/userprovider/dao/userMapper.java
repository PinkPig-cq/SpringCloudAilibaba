package com.hpeu.userprovider.userprovider.dao;

import com.hpeu.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface userMapper {
    List<Users> findAll();
    Users findById(@Param("id") Integer id);
}
