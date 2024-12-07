package databaseoperation;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javabean.UserDataBean;

public class AddUserDetailDAO {
	
	public int k=0;
	
	public int addData(UserDataBean ub)
	{
		try {
			Connection con=DatabaseConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("Insert into User68 values(?,?,?,?,?,?,?)");
			
			ps.setString(1, ub.getUserName());
			ps.setString(2, ub.getPass());
			ps.setString(3, ub.getFname());
			ps.setString(4, ub.getLname());
			ps.setString(5, ub.getCity());
			ps.setString(6, ub.getMid());
			ps.setLong(7, ub.getPhno());
			
			k=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return k;
	}

}
