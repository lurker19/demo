package com.house.utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 数据库连接操作类
 * @author Lz
 *
 */
public class DBHelper {

	private static Connection con = null ;
	
	public static Connection getConnection(){
		if(con == null){
			try {
				Class.forName("com.mysql.jdbc.Driver") ;
				String url = "jdbc:mysql://localhost:3306/lkd" ;
				con = DriverManager.getConnection(url,"root","19981218") ;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return con ;
	}
	public void closeAll(){
		//关闭连接等对象
	}
}
