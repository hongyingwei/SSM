package com.javaee.springmvc.handler;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("进入controller..........");
		ModelAndView modelAndView=new ModelAndView();
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        System.err.println(userName);
        if("admin".equals(password)&&"admin".equals(userName)){
            modelAndView.setViewName("success");
        }else{
            modelAndView.setViewName("fail");
        }
        return modelAndView;
    }

}
