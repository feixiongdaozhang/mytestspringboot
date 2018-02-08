package com.huada.manager.domain;


import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
public class SysUser implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6921053966214300389L;
	private Integer id;
    private String username;
    private String password;
    private List<SysRole> roles;
	
}
