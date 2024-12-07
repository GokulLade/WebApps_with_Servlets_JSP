package userinput;

import java.io.IOException;
import java.io.PrintWriter;

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
	RequestDispatcher rd=null;
	
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
		int result=cd.getResult();
		if(result>0)
		{
			req.setAttribute("BeanObj", cb);
			
			rd=req.getRequestDispatcher("ViewCustomerByPhno.jsp");
			rd.forward(req, res);
		}
		else
		{
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			pw.print("Invalid Phone Number..!");
			
			rd=req.getRequestDispatcher("viewByPhoneNumber.html");
			rd.include(req, res);
		}
	}
}


