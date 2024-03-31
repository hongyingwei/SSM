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

	/**
     * 更新用户信息,更新用户名
     * @param user
     */
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		sqlSession.update("user.updateUser", user);
		sqlSession.commit();
		sqlSession.close();
	}

	/**
     * 根据ID，删除用户信息
     * @param id
     */
	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		sqlSession.delete("user.deleteById", id);
		sqlSession.commit();
		sqlSession.close();
	}

	/**
     * 根据ID，查询用户信息
     * @param id
     * @return
     */
	@Override
	public User queryById(int id) {
		// TODO Auto-generated method stub
		User user = sqlSession.selectOne("user.queryById", id);
		sqlSession.close();
		return user;
	}
	/**
     * 根据用户名，查询用户信息
     * @param name
     * @return
     */
	@Override
	public List<User> queryByName(String name) {
		// TODO Auto-generated method stub
		List<User> users = sqlSession.selectList("user.queryByName", name);
		sqlSession.close();
		return users;
	}
	
}
