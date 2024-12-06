package databaseoperation;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javabean.CustomerDetailBean;

public class AddCustomerDetailDAO {
	
	int k=0;
	public int addData(CustomerDetailBean cb)
	{
		try 
		{
			Connection con=DatabaseConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("Insert into Customer68 values(?,?,?,?)");
			
			ps.setLong(1,cb.getPhno());
			ps.setString(2, cb.getName());
			ps.setString(3, cb.getCity());
			ps.setString(4, cb.getEmail());
			
			k=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return k;
	}
}
