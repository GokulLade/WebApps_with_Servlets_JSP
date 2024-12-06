package databaseoperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javabean.CustomerDetailBean;

public class RetrieveAllCustomerDataDAO {
	
	ArrayList<CustomerDetailBean> al= new ArrayList<CustomerDetailBean>();
	
	public ArrayList<CustomerDetailBean> getData()
	{
		try {
			
			Connection con=DatabaseConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("Select * From Customer68");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				CustomerDetailBean cb=new CustomerDetailBean();
				cb.setPhno(rs.getLong(1));
				cb.setName(rs.getString(2));
				cb.setCity(rs.getString(3));
				cb.setEmail(rs.getString(4));
				
				al.add(cb);
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return al;
		
	
	}

}
