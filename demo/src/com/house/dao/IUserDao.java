package com.house.dao;

import com.house.vo.User;

public interface IUserDao {

	/**
	 * �û���½
	 * @param name
	 * @param pwd
	 * @return
	 */
	public boolean login(String name , String pwd);
	
	public boolean editorUser(User uer) ;
}
