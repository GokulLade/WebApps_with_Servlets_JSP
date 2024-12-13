package userinput;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javabean.CustomerDataBean;

import java.io.IOException;
import java.io.PrintWriter;

import databaseoperation.CustomerRegistrationDAO;


@SuppressWarnings("serial")
@WebServlet("/customerregistration")
public class CustomerRegistrationServlet extends HttpServlet {
	CustomerDataBean cb=null;
	CustomerRegistrationDAO crd=null;
	@Override
	public void init()
	{
		cb=new CustomerDataBean();
		crd= new CustomerRegistrationDAO();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		cb.setUsername(req.getParameter("username"));
		cb.setPassword(req.getParameter("password"));
		cb.setFname(req.getParameter("fname"));
		cb.setLname(req.getParameter("lname"));
		cb.setMailid(req.getParameter("emailid"));
		cb.setPhno(Long.parseLong(req.getParameter("phno")));
		
		int result=crd.addCustomerData(cb);
		
		if(result>0)
		{
			req.setAttribute("msg","Registration Success Login now..!");
			req.getRequestDispatcher("CustomerLoginPage.jsp").forward(req, res);
		}
		else
		{
			res.setContentType("text/html");
			
			PrintWriter pw=res.getWriter();
			pw.print("<div class='error-msg'>Username is not available. Please try another</div>");
			req.getRequestDispatcher("customerregistration.html").include(req, res);
		}
	}

}
