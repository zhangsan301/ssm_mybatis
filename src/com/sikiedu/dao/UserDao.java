package com.sikiedu.dao;

import com.sikiedu.bean.User;

public interface UserDao {
    //根据id查询用户的接口
    public User getUserById(Integer id);

}
