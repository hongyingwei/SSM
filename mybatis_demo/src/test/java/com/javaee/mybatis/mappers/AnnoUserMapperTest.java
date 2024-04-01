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

public class AnnoUserMapperTest {

    private SqlSession sqlSession;
    AnnoUserMapper userMapper;

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
        userMapper = sqlSession.getMapper(AnnoUserMapper.class);
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
        user.setCnname("水电费水电费");
        user.setUser_name("fadsf");
        user.setEmail("fasdf");
        user.setSex('1');
        user.setMobile("fasdf");
        user.setNote("fadsf");
        //调用mapper中的方法完成数据的持久化
        userMapper.saveUserInfo(user);

        sqlSession.commit();
    }

    @Test
    public void testDeleteById() {
        userMapper.deleteById(6);
        sqlSession.commit();
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setCnname("张三5");
        user.setId(1);

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