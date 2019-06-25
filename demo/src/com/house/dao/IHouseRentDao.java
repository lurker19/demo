package com.house.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.house.vo.Rent;

public interface IHouseRentDao {

	public boolean newHouse(Rent rent) ;
	
	public ArrayList<Rent> searchHouse(HashMap<String, Object> params);
}
