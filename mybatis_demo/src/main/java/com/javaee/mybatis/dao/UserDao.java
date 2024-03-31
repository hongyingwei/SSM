package com.javaee.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.javaee.mybatis.entity.User;

public interface UserDao {
    void saveUserInfo(User user);

    void updateUser(User user);

    void deleteById(int id);

    User queryById(int id);

    List<User> queryByName(String name);

    void setSqlSession(SqlSession sqlSession);
}
