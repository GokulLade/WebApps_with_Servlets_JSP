package databaseoperation;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javabean.ProductBean;
public class DeleteProductDAO {
	
	public int k=0;
	public int delete(ProductBean pb) 
	{
	try {
		Connection con = DatabaseConnection.getConnection();
		PreparedStatement ps = con.prepareStatement
		("delete from Product68 where code=?");
		ps.setString(1,pb.getCode());
		k = ps.executeUpdate();
	}
	catch(Exception e) 
	{
		e.printStackTrace();
	}
	return k;
	}

}
