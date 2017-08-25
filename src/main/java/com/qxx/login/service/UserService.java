package com.qxx.login.service;

import com.qxx.login.dao.UserDao;
import com.qxx.login.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qxx
 * @create 2017-08-25 11:20
 **/
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public int addUser(User user){
        return userDao.add(user);
    }
}
