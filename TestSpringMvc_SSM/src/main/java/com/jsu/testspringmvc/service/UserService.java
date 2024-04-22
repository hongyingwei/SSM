package com.jsu.testspringmvc.service;

import com.jsu.testspringmvc.entity.User;
import com.jsu.testspringmvc.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author 离歌笑
 * @date 2020-06-14
 */
@Service("UserService")
@Transactional(readOnly=true)
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User validateUserInfo(User user){
        return this.userMapper.validateUserInfo(user);
    }

	public User findUserBy(int id) {
		return this.userMapper.findUserById(id);
	}

}
