package com.transaction.service;

import com.transaction.model.User;

public interface UserService {
    public User selectUser(long userId);

    public User login(User user);
}
