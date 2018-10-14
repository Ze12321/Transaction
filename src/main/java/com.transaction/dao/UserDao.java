package com.transaction.dao;

import com.transaction.model.User;

public interface UserDao {

    /**
     * 登录方法
     * 参数:user
     * user属性:name password
     * 返回：user 或 null
     * @param user
     * @return user
     */
    User login(User user);

    /**
     *
     * @param id
     * @return User
     */
    User selectUser(long id);
}
