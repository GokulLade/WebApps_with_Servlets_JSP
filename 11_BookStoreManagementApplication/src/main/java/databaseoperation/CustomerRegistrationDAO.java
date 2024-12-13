package databaseoperation;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javabean.CustomerDataBean;

public class CustomerRegistrationDAO {
	
	int k=0;
	
	public int addCustomerData(CustomerDataBean cb)
	{
		try {
			
			Connection con=DatabaseConnection.getConnection();
			
			PreparedStatement ps=con.prepareStatement("Insert into CustomerDetails68 values (?,?,?,?,?,?)");
			
			ps.setString(1, cb.getUsername());
			ps.setString(2, cb.getPassword());
			ps.setString(3, cb.getFname());
			ps.setString(4, cb.getLname());
			ps.setString(5, cb.getMailid());
			ps.setLong(6, cb.getPhno());
			
			k=ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		return k;
		
	}

}
