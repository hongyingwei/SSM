package com.javaee.springmvc.handler;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.javaee.springmvc.pojo.User;
import com.javaee.springmvc.pojo.UserInfoReq;

@Controller // ��ʶ����ΪSpring MVC�е�handler
@RequestMapping("/UserHandler")
public class UserHandler {

    @RequestMapping(value = "/login", method = RequestMethod.GET) // ��ʶurl��ַ��
    public String doLogin(HttpServletRequest request, HttpServletResponse response) {
    	System.out.println("����Handler..........login");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        if ("admin".equals(password) && "admin".equals(userName)) {
            return "success";
        } else {
            return "fail";// �߼���ͼ��
        }
    }
    
    @RequestMapping("/login2") // ��ʶurl��ַ��,�������@requestParam������Ҫ������������Ĳ�������һ��
    public ModelAndView doLogin2(String userName, String password) {
    	System.out.println("����Handler..........login2");
    	ModelAndView mv = new ModelAndView();
    	System.err.println(userName +" " + password);
    	if ("admin".equals(password) && "admin".equals(userName)) {
    		mv.setViewName("success");
        } else {
        	mv.setViewName("fail");
        }
    	return mv;
    }
    
    @RequestMapping(value = "/login3", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST) // ��ʶurl��ַ��
    public String doLogin3(@RequestBody User user) {
    	System.out.println("����Handler..........login3");
    	ModelAndView mv = new ModelAndView();
    	System.err.println(user.toString());
    	if ("admin".equals(user.getPassword()) && "admin".equals(user.getUserName())) {
    		return "success";
        } else {
        	return "fail";
        }
    }
    
    @GetMapping(value = "/getUsers", produces = MediaType.APPLICATION_JSON_VALUE) // ��ʶurl��ַ��
    public @ResponseBody List<User> getUserList(){
    	System.out.println("����Handler..........getUsers");
    	List<User> users = new ArrayList<User>();
    	users.add(new User("aaa1", "1111"));
    	users.add(new User("aaa2", "2211"));
    	users.add(new User("aaa3", "3311"));
    	users.add(new User("aaa4", "4411"));
    	return users;
    }
     
    @RequestMapping(value = "/addUsers") // ��ʶurl��ַ��
    public @ResponseBody List<User> addUserList(@RequestBody List<User> users){
    	System.out.println("����Handler..........getUsers");
    	users.forEach(user -> {
    		System.err.println(user.toString());
    	});
    	return users;
    }
    
    @RequestMapping(value = "/addUsersAndMesg") // ��ʶurl��ַ��
    public @ResponseBody List<User> addUserListAndMessage(@RequestBody List<User> users,
    		 @RequestParam(value="message", required = false) String message, 
    		 @RequestParam(value="keyId", required = true) int keyId){
    	System.out.println("����Handler..........addUsersAndMesg");
    	users.forEach(user -> {
    		System.err.println(user.toString());
    	});
    	System.err.println(message);
    	System.err.println(keyId);
    	return users;
    }
    
    @RequestMapping(value = "/addDataTeam", method = RequestMethod.POST) // ��ʶurl��ַ��
	 public @ResponseBody UserInfoReq addData(@RequestBody UserInfoReq userInfoReq) {
		 System.err.println(userInfoReq.toString());
		 return userInfoReq;
	 }
}
