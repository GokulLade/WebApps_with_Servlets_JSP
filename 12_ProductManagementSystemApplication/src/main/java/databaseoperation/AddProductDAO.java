package databaseoperation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javabean.ProductBean;

public class AddProductDAO {

	public int k=0;
	public int insertProduct(ProductBean pb,HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		
		try 
		{
			Connection con = DatabaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement
			("insert into Product68 values(?,?,?,?)");
			ps.setString(1, pb.getCode());
			ps.setString(2, pb.getName());
			ps.setFloat(3, pb.getPrice());
			ps.setInt(4, pb.getQty());
			k = ps.executeUpdate();
		}
		catch(SQLIntegrityConstraintViolationException se)
		{
			req.setAttribute("exMsg","Product already available....<br>");
			req.getRequestDispatcher("ExceptionMsg.jsp").forward(req, res);
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		return k;
		
	}
}
