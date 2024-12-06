package javabean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CustomerDetailBean implements Serializable {
	
	private long phno;
	private String name,city,email;
	
	public CustomerDetailBean() {}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
