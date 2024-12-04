package userdata;

import java.io.IOException;
import java.util.ArrayList;

import databaseoperation.ViewBookDetailsDAO;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import javabean.BookBean;

@SuppressWarnings("serial")

@WebServlet("/view")
public class ViewBookDetailsServlet extends GenericServlet{

	public ViewBookDetailsDAO obj=null;
	@Override
	public void init()
	{
		obj=new ViewBookDetailsDAO();
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		ArrayList<BookBean> al=obj.retrieve();
		req.setAttribute("allist", al);
		
		RequestDispatcher rd=req.getRequestDispatcher("ViewBookDetails.jsp");
		rd.forward(req, res);
	}

}
