package databaseoperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javabean.ProductBean;

public class ViewAllProductsDAO {

	public ArrayList<ProductBean>al = new ArrayList<>();
	
	public ArrayList<ProductBean> retrieve()
	{
		
		try 
		{
			Connection con = DatabaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from Product68");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				ProductBean pb = new ProductBean();
				pb.setCode(rs.getString(1));
				pb.setName(rs.getString(2));
				pb.setPrice(rs.getFloat(3));
				pb.setQty(rs.getInt(4));
				al.add(pb);//Adding ProductBean to ArrayList Object
			}//end of loop
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return al;
		
	}//end of method
	
}
