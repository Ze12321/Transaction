package com.transaction.service.impl;

import com.transaction.dao.UserDao;
import com.transaction.model.User;
import com.transaction.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

    public User login(User user) {
        return this.userDao.login(user);
    }
}
