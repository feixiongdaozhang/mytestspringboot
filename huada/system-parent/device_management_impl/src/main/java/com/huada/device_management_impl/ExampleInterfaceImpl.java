package com.huada.device_management_impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huada.device_management_interface.ExampleInterface;
import com.huada.manager.domain.SysUser;
import com.huada.manager.managers.UserDao;


@Service(value="exampleInterface")
public class ExampleInterfaceImpl implements ExampleInterface{
	@Autowired
	UserDao userDao ;
	@Override
	public SysUser findByUserName(String username) {
		return userDao.findByUserName(username);
	}

}
