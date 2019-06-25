package com.house.vo;
/**
 * 实体类——与数据库表对应
 * @author Lz
 *
 */
public class User {

	private int lid ;
	private String lname ;
	private String lpwd ;
	private String lmom ;
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLpwd() {
		return lpwd;
	}
	public void setLpwd(String lpwd) {
		this.lpwd = lpwd;
	}
	public String getLmom() {
		return lmom;
	}
	public void setLmom(String lmom) {
		this.lmom = lmom;
	}
	
	
}
