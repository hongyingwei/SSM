package com.javaee.mybatis.mappers;

import java.util.List;

import com.javaee.mybatis.entity.User;

public interface UserMapper {
	/**
	 * 保存用户信息
	 * @param user
	 */
    int saveUserInfo(User user);

    /**
     * 更新用户信息,更新用户名
     * @param user
     */
    int updateUser(User user);

    /**
     * 根据ID，删除用户信息
     * @param id
     */
    void deleteById(int id);

    /**
     * 根据ID，查询用户信息
     * @param id
     * @return
     */
    User queryById(int id);

    /**
     * 根据用户名，查询用户信息
     * @param name
     * @return
     */
    List<User> queryByName(String name);
}
