package userinput;

import java.io.IOException;
import java.io.PrintWriter;

import databaseoperation.AddCustomerDetailDAO;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import javabean.CustomerDetailBean;

@SuppressWarnings("serial")

@WebServlet("/add")
public class AddCustomerDetailsServlet extends GenericServlet{

	public CustomerDetailBean cb=null;
	public AddCustomerDetailDAO ad=null;
	@Override
	public void init()
	{
		cb=new CustomerDetailBean();
		ad=new AddCustomerDetailDAO();
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		cb.setPhno(Long.parseLong(req.getParameter("phno")));
		cb.setName(req.getParameter("name"));
		cb.setCity(req.getParameter("city"));
		cb.setEmail(req.getParameter("email"));
		
		int result=ad.addData(cb);
		
		res.setContentType("text/html");
		
		PrintWriter pw=res.getWriter();
		
		if(result>0)
		{
			pw.print("Data Added Successfully..!");
			
			RequestDispatcher rd=req.getRequestDispatcher("addCustomerDetails.html");
			rd.include(req, res);
		}
		else
		{
			pw.print("Something is wrong try agin..!");
			
			RequestDispatcher rd=req.getRequestDispatcher("addCustomerDetails.html");
			rd.include(req, res);
		}
	}

}
