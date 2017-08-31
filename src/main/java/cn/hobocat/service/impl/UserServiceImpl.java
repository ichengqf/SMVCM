package cn.hobocat.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hobocat.mapper.UserMapper;
import cn.hobocat.model.User;
import cn.hobocat.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public List<User> findUserList(User user) throws Exception {
		return userMapper.findUserList(user);
	}
}