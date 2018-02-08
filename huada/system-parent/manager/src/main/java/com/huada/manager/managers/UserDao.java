package com.huada.manager.managers;

import com.huada.manager.domain.SysUser;

public interface UserDao {
	public SysUser findByUserName(String username);
}
