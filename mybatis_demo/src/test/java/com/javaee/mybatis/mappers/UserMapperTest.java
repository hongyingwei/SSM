package com.javaee.mybatis.mappers;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.javaee.mybatis.entity.User;

public class UserMapperTest {
	public UserMapper userMapper;
	public SqlSession sqlSession;
	
	@Before
	public void Before() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory sqlSessionFactory = builder.build(is);
		is.close();
		sqlSession = sqlSessionFactory.openSession();
		userMapper = sqlSession.getMapper(UserMapper.class);
	}
	
    @After
    public void after() {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }
    
    @Test
    public void saveUserInfo() {
        User user = new User();
        user.setCnname("aaa333");
        user.setUser_name("aa333");
        user.setEmail("fasdf");
        user.setSex('1');
        user.setMobile("fasdf");
        user.setNote("fadsf");
        //调用mapper中的方法完成数据的持久化
        int result = userMapper.saveUserInfo(user);
        System.out.println("result:" + result);
        sqlSession.commit();
    }

    @Test
    public void testDeleteById() {
        userMapper.deleteById(8);
        sqlSession.commit();
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setCnname("张er6");
        user.setId(6);

        int cnt = userMapper.updateUser(user);
        System.out.println(cnt);
        sqlSession.commit();
    }

    @Test
    public void queryById() {
        User user = userMapper.queryById(1);
        System.out.println(user);
    }

    @Test
    public void queryByName() {
        List<User> users = userMapper.queryByName("张");
        for (User u: users) {
            System.out.println(u);
        }
    }
}
