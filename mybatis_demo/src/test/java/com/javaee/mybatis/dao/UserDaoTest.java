package com.javaee.mybatis.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.javaee.mybatis.dao.impl.UserDaoImpl;
import com.javaee.mybatis.entity.User;

public class UserDaoTest {
	public SqlSession sqlSession;
	public UserDao userDao;
	
	@Before
	public void before() throws IOException {
		 //1.加载配置文件
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //2.得到SqlSesssionFactory对象
        SqlSessionFactory sqlSessionFactory = builder.build(is);
        is.close();
        sqlSession = sqlSessionFactory.openSession();
        //通过sqlSession中的方法获取mapper的代理对象
        userDao = new UserDaoImpl();
        userDao.setSqlSession(sqlSession);
	}
	
	@Test
    public void saveUserInfo() {
        User user = new User();
        user.setCnname("fasdfasdf");
        user.setUser_name("fadsf");
        user.setEmail("fasdf");
        user.setSex('1');
        user.setMobile("fasdf");
        user.setNote("fadsf");
        userDao.saveUserInfo(user);
    }
	
	@After
    public void after() {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }
}
