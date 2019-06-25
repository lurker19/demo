package com.house.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.house.dao.IUserDao;
import com.house.utils.DBHelper;
import com.house.vo.User;

public class UserDaoImpl implements IUserDao{
	
	private Connection con = DBHelper.getConnection() ;

	@Override
	public boolean login(String name, String pwd) {
		try {
			String sql = "SELECT * FROM login_user WHERE lname=? AND lpwd=?" ;
			PreparedStatement pst = con.prepareStatement(sql) ;
			pst.setString(1, name);
			pst.setString(2, pwd);
			ResultSet rs = pst.executeQuery() ;
			if(rs.next()){
				return true ;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean editorUser(User uer) {
		// TODO Auto-generated method stub
		return false;
	}

}
