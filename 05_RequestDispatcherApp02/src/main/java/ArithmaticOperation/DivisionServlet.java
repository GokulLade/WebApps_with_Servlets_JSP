package ArithmaticOperation;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")

@WebServlet("/div")
public class DivisionServlet extends GenericServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		float result=0;
		res.setContentType("text/html");
		
		PrintWriter pw=res.getWriter();
		
		try {
			
			result=(float)(num1/num2);
		}
		catch(Exception e)
		{
		}
		
		pw.print("Division of two number is : "+result);
		
		RequestDispatcher rd=req.getRequestDispatcher("index.html");
		rd.include(req, res);
	}

}
