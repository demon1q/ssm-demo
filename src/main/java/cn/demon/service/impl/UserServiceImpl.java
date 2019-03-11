package cn.demon.service.impl;

import cn.demon.pojo.User;
import cn.demon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @desciption: UserService实现类
 * @author: Demon
 * @version: 1.0 2019-03-11 14:14
 **/
public class UserServiceImpl implements UserService {
    @Autowired
    private UserService userService;

    @Override
    public User login(String username) {
        return null;
    }
}
