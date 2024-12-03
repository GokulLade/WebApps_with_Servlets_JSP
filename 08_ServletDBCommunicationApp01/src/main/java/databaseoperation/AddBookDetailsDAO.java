package databaseoperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javabean.BookBean;

public class AddBookDetailsDAO {

	public int k=0;
	
	public int  insertBookDetail(BookBean bb) 
	{
		
		try 
		{
			Connection con=DatabaseConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into Bookdetails36 values(?,?,?,?,?)");
			
			ps.setString(1, bb.getCode());
			ps.setString(2, bb.getName());
			ps.setString(3, bb.getAuthor());
			ps.setFloat(4,bb.getPrice());
			ps.setInt(5, bb.getQty());
			
			k=ps.executeUpdate();
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

		return k;
	}

}
