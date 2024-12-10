package databaseoperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javabean.UserDataBean;

public class CheckUserLoginDAO {

	UserDataBean ub=null;
	
	public UserDataBean checkLogin(String username,String password)
	{
		try {
			Connection con=DatabaseConnection.getConnection();
			PreparedStatement ps= con.prepareStatement("Select * from user68 WHERE uname=? AND pword=?");
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				ub= new UserDataBean();
				
				ub.setUserName(rs.getString(1));
				ub.setPass(rs.getString(2));
				ub.setFname(rs.getString(3));
				ub.setLname(rs.getString(4));
				ub.setCity(rs.getString(5));
				ub.setMid(rs.getString(6));
				ub.setPhno(rs.getLong(7));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return ub;
	}
}
