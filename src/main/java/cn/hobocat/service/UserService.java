package cn.hobocat.service;

import java.util.List;

import cn.hobocat.model.User;


public interface UserService {
	//商品查询列表
	List<User> findUserList(User user) throws Exception;

}