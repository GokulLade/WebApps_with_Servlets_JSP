package databaseoperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javabean.AdminBean;

public class AdminloginDAO {
	
	
	public AdminBean login(String uN,String pW) 
	{
		AdminBean ab = null;
		
		try {
			Connection con = DatabaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from Admin68 where uname=? and pword=?");
			
			ps.setString(1, uN);
			ps.setString(2, pW);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) 
			{
				ab = new AdminBean();
				ab.setUsername(rs.getString(1));
				ab.setPword(rs.getString(2));
				ab.setFname(rs.getString(3));
				ab.setLname(rs.getString(4));
				ab.setCity(rs.getString(5));
				ab.setMid(rs.getString(6));
				ab.setPhno(rs.getLong(7));
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	return ab;
	}

}
