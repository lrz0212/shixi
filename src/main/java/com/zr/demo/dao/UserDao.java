package com.zr.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zr.model.User;

@Mapper
public interface UserDao {  
    public User selectUserById(Integer userId);
    public List<User> selectAllUsers();  
  
}  
