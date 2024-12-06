package databaseoperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javabean.CustomerDetailBean;

public class RetrieveByPhNoCustomerDataDAO {

	CustomerDetailBean cb=new CustomerDetailBean();
	
	public CustomerDetailBean getDataByPhNo(long phno)
	{
		try {
			Connection con=DatabaseConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("Select * from Customer68 Where phno=?");
			
			ps.setLong(1, phno);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				cb.setPhno(rs.getLong(1));
				cb.setName(rs.getString(2));
				cb.setCity(rs.getString(3));
				cb.setEmail(rs.getString(4));
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return cb;
	}
}
