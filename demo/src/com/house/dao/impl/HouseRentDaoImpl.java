package com.house.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.house.dao.IHouseRentDao;
import com.house.utils.DBHelper;
import com.house.vo.Rent;

public class HouseRentDaoImpl implements IHouseRentDao{

	private Connection con = DBHelper.getConnection() ;
	
	@Override
	public boolean newHouse(Rent rent) {
		try {
			String sql = "INSERT INTO t_house_rent VALUES(DEFAULT,?,?,?,?,?,?,?,?)" ;
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, rent.getRid());
			pst.setString(2, rent.getRtitle());
			pst.setInt(3, rent.getRprice());
			pst.setInt(4, rent.getRarea());
			pst.setString(5, rent.getRposition());
			pst.setString(6, rent.getRdate());
			pst.setString(7, rent.getRpicture());
			pst.setString(8, rent.getRremarks());
			int n = pst.executeUpdate() ;
			if(n > 0){
				return true ;
			}
		} catch (Exception e) {
			e.printStackTrace(); 
		} 
		return false;
	}

	@Override
	public ArrayList<Rent> searchHouse(HashMap<String, Object> params) {
		ArrayList<Rent> datas = new ArrayList<Rent>() ;
		try {
			String sql = "SELECT * FROM t_house_rent WHERE 1=1 " ;
			Set<String> keys = params.keySet() ;
			Iterator<String> it = keys.iterator() ;
			while(it.hasNext()){
				String key = it.next() ;
				sql += " AND " + key + "=?" ;
			}
			System.out.println(sql);
			PreparedStatement pst = con.prepareStatement(sql);
			it = keys.iterator() ;
			for(int i=1 ;it.hasNext();i++){
				String key = it.next() ;
				pst.setString(i, params.get(key)+"");
			}
			ResultSet rs = pst.executeQuery() ;
			while(rs.next()){
				Rent rent = new Rent();
				rent.setRid(rs.getInt(1));
				rent.setLid(rs.getInt(2));
				rent.setRtitle(rs.getString(3));
				rent.setRprice(rs.getInt(4));
				rent.setRarea(rs.getInt(5));
				rent.setRposition(rs.getString(6));
				rent.setRdate(rs.getString(7));
				rent.setRpicture(rs.getString(8));
				rent.setRremarks(rs.getString(9));
				datas.add(rent) ;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return datas ;
	}

}
