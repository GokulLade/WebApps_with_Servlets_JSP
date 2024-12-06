package userinput;

import java.io.IOException;

import databaseoperation.RetrieveByPhNoCustomerDataDAO;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import javabean.CustomerDetailBean;

@SuppressWarnings("serial")

@WebServlet("/viewByPhno")
public class ViewByPhoneNumberServlet extends GenericServlet {
	
	RetrieveByPhNoCustomerDataDAO cd=null;
	
	@Override
	public void init()
	{
		cd=new RetrieveByPhNoCustomerDataDAO();
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		long phno=Long.parseLong(req.getParameter("phno"));
		
		CustomerDetailBean cb=cd.getDataByPhNo(phno);
		
		req.setAttribute("BeanObj", cb);
		
		RequestDispatcher rd=req.getRequestDispatcher("ViewCustomerByPhno.jsp");
		rd.forward(req, res);
	}
}


