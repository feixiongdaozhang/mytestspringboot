package com.huada.manager.domain;



import java.io.Serializable;

import lombok.Data;

@Data
public class SysRole implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2638643352366479201L;
	private Integer id;
    private String name;
}
