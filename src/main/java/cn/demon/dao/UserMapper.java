package cn.demon.dao;

import cn.demon.pojo.User;

public interface UserMapper {
    /**
     * 根据用户名返回对象
     * @param username 用户名
     * @return User对象
     */
    User selectByName(String username);
}
