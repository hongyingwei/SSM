package com.javaee.mybatis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.javaee.mybatis.dao.UserDao;
import com.javaee.mybatis.entity.User;

public class UserDaoImpl implements UserDao{
	private SqlSession sqlSession;

	@Override
	public void setSqlSession(SqlSession sqlSession) {
		// TODO Auto-generated method stub
		this.sqlSession = sqlSession;
	}
	/**
	 * 添加用户信息
	 */
	@Override
	public void saveUserInfo(User user) {
		// TODO Auto-generated method stub
		sqlSession.insert("user.saveUserInfo", user);
		sqlSession.commit();
		sqlSession.close();
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User queryById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> queryByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
