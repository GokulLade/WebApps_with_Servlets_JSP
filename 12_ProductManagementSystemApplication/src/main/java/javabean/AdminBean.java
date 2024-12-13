package javabean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AdminBean implements Serializable {

	private String username,pword,fname,lname,city,mid;
	private long phno;
	
	
	public AdminBean() {}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPword() {
		return pword;
	}


	public void setPword(String pword) {
		this.pword = pword;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getMid() {
		return mid;
	}


	public void setMid(String mid) {
		this.mid = mid;
	}


	public long getPhno() {
		return phno;
	}


	public void setPhno(long phno) {
		this.phno = phno;
	};
	
	
}
