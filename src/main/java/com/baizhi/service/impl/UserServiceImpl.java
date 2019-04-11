package com.baizhi.service.impl;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;


	@Override
	public List<User> selectAllUser() {
		List<User> userList = userDao.selectAll();
		return userList;
	}

}
