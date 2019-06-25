package com.house.dao;

import com.house.vo.User;

public interface IUserDao {

	public boolean login(String name , String pwd);
	
	public boolean editorUser(User uer) ;
}
