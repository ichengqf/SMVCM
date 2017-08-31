package cn.hobocat.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.hobocat.model.User;
import cn.hobocat.service.UserService;


@Controller
@RequestMapping(value = "/user")
public class UserController  {
	
	@Resource
	private UserService userService;
	
    @RequestMapping(path = "/add")
    public ModelAndView save(@ModelAttribute User user,HttpServletRequest request, HttpServletResponse response) {
        System.out.println(user.getId()+":"+user.getUser_name());
        Map<String, Object> map=new HashMap<String,Object>();
         map.put("id", user.getUser_id());
         map.put("name", user.getUser_name());


        return new ModelAndView("test.jsp", "User", map);
    }
    @RequestMapping(path = "/list")
    public ModelAndView list(@ModelAttribute User user,HttpServletRequest request, HttpServletResponse response) throws Exception {
    	System.out.println(user.getId()+":"+user.getUser_name());
    	Map<String, Object> map=new HashMap<String,Object>();
    	map.put("id", user.getUser_id());
    	map.put("name", user.getUser_name());
    	List<User> userList = userService.findUserList(user);
    	System.out.println(userList.size());
    	return new ModelAndView("test.jsp", "User", map);
    }

}