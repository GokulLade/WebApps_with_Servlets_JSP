package databaseoperation;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javabean.UserDataBean;

public class UpdateProfileDAO {
	public int k=0;
	public int update(UserDataBean ub)
	{
		try 
		{
			Connection con = DatabaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("update User68 set city=?,mid=?,phno=? where uname=? and pword=?");
		
			ps.setString(1, ub.getCity());
			ps.setString(2, ub.getMid());
			ps.setLong(3, ub.getPhno());
			ps.setString(4, ub.getUserName());
			ps.setString(5, ub.getPass());
			
			k = ps.executeUpdate();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		return k;
	}

}
