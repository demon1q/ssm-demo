package cn.demon.service.impl;

import cn.demon.dao.UserMapper;
import cn.demon.pojo.User;
import cn.demon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @desciption: UserService实现类
 * @author: Demon
 * @version: 1.0 2019-03-11 14:14
 **/
@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User login(String username) {
        return userMapper.selectByName(username);
    }
}
