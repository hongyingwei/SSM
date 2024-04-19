package com.jsu.testspringmvc.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.jsu.testspringmvc.entity.User;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
	@Select("SELECT * from t_user where user_name=#{user_name} and password=#{password}")
	User validateUserInfo(User user);
	User findUserById(int id);
}
