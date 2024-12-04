package databaseoperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javabean.BookBean;

public class ViewBookDetailsDAO {
	
	public ArrayList<BookBean> al = new ArrayList<BookBean>();
	
	public ArrayList<BookBean> retrieve()
	{
		try 
		{
				Connection con=DatabaseConnection.getConnection();
				PreparedStatement ps=con.prepareStatement("Select * From BookDetails36");
				
				ResultSet rs=ps.executeQuery();
				
				while(rs.next())
				{
					BookBean bb=new BookBean();
					
					bb.setCode(rs.getString(1));
					bb.setName(rs.getString(2));
					bb.setAuthor(rs.getString(3));
					bb.setPrice(rs.getFloat(4));
					bb.setQty(rs.getInt(5));
					
					al.add(bb); //Bean added to array list
				}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return al;
	}

}
