package com.jsu.testspringmvc.controller;

import com.jsu.testspringmvc.entity.User;
import com.jsu.testspringmvc.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author 离歌笑
 * @date 2020-06-14
 */
@Controller
public class LoginController {
    Logger logger = Logger.getLogger("MyLog");

    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public String login(@Validated User user, BindingResult bindingResult, HttpSession session, Model model) {
        logger.info("param user:" + user);
        if (bindingResult.hasErrors()) {
            //校验未通过，获取所有的异常信息并展示出来
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            StringBuilder sb = new StringBuilder();
            for (ObjectError allError : allErrors) {
                System.out.println(allError.getObjectName() + ":" + allError.getDefaultMessage());
                sb.append(allError.getDefaultMessage()+"<br>");
            }
            System.err.println(sb.toString());
            model.addAttribute("msg", sb.toString());
            return "error";
        }
        
        User userInfo = this.userService.validateUserInfo(user);
        if (userInfo != null) {
            session.setAttribute("user", userInfo);
            logger.info("login ok, result user: " + userInfo);
            return "success";
        } else {
            logger.info("login fail");
            model.addAttribute("msg", "登录失败！请检查用户名/密码后重试");
            return "login";
        }
    }
}