package com.javaee.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.javaee.mybatis.entity.User;

public interface AnnoUserMapper {

    @Insert("INSERT INTO t_user(user_name,cnname,sex,mobile,email,note) VALUES(#{user_name},#{cnname},#{sex},#{mobile},#{email},#{note})")
    void saveUserInfo(User user);

    @Update("update t_user set cnname=#{cnname} where id=#{id}")
    int updateUser(User user);

    @Delete("DELETE from t_user where id=#{value}")
    void deleteById(int id);

    @Select("select * FROM t_user where id=#{value}")
    User queryById(int id);

    @Select("SELECT * from t_user where cnname LIKE '${value}%'")
    List<User> queryByName(String name);
}