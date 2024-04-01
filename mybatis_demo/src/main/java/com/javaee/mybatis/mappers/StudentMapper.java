package com.javaee.mybatis.mappers;

import com.javaee.mybatis.entity.Student;

public interface StudentMapper {
	/**
	 * 根据
	 * @param id
	 * @return
	 */
    Student findById(int id);
    Student findHealthInfo(int id);
}
