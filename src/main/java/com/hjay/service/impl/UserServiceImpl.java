package com.hjay.service.impl;

import com.hjay.dao.UserRepository;
import com.hjay.po.User;
import com.hjay.service.Userservice;
import com.hjay.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: HJAY
 * @Description: com.hjay.service.impl
 * @version: 1.0
 */
@Service
public class UserServiceImpl implements Userservice {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        System.out.println(username);
        System.out.println(password);
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        System.out.println(MD5Utils.code(password));
        return user;
    }
}
