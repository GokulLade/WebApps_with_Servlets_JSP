package ArithmaticOperations;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")

@WebServlet("/gl")
public class GreaterServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		int num1=Integer.parseInt(req.getParameter("v1"));
		int num2=Integer.parseInt(req.getParameter("v2"));
		
		int result;
		
		if(num1>num2)
		{
			result=num1;
		}
		else
		{
			 result=num2;
		}
		
		PrintWriter pw=res.getWriter();
		
		res.setContentType("text/html");
		
		pw.print("Greater Number is : "+result+"<br>");
		
		RequestDispatcher rd = req.getRequestDispatcher("index.html");
		rd.include(req, res);
		
	}

}
