package userinput;

import java.io.IOException;
import java.util.ArrayList;

import databaseoperation.RetrieveAllCustomerDataDAO;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import javabean.CustomerDetailBean;

@SuppressWarnings("serial")

@WebServlet("/viewAll")
public class ViewAllCustomerDetails extends GenericServlet{
	
	RetrieveAllCustomerDataDAO rc=null;
	
	@Override
	public void init()
	{
		rc=new RetrieveAllCustomerDataDAO();
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		ArrayList<CustomerDetailBean> al=rc.getData();
		
		req.setAttribute("list", al);
		
		RequestDispatcher rd=req.getRequestDispatcher("ViewAllCustomerDetail.jsp");
		rd.forward(req, res);
	}

}
