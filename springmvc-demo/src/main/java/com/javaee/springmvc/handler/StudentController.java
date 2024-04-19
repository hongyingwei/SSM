package com.javaee.springmvc.handler;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javaee.springmvc.pojo.Student;

/**
 * 数据校验
 */
@Controller
@RequestMapping("/StudentHandler")
public class StudentController {
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
	public @ResponseBody Object addStudent(@RequestBody @Validated Student student, BindingResult bindingResult) {
		System.out.println("进入Handler..........addStudent");
		if (bindingResult.hasErrors()) {
            //校验未通过，获取所有的异常信息并展示出来
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            StringBuilder sb = new StringBuilder();
            for (ObjectError allError : allErrors) {
                System.out.println(allError.getObjectName() + ":" + allError.getDefaultMessage());
                sb.append(allError.getDefaultMessage()+"\n");
            }
            System.err.println(sb.toString());
            return "error message:\n" + sb.toString();
        }
		System.err.println(student.toString());
		return student;
	}
}
