package com.hjay.dao;

import com.hjay.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: HJAY
 * @Description: com.hjay.dao;
 * @version: 1.0
 */
public interface UserRepository extends JpaRepository<User,Long> {
    /**
     * 通过用户名和密码查询用户
     * @param username
     * @param password
     * @return
     */
    User findByUsernameAndPassword(String username, String password);
}
