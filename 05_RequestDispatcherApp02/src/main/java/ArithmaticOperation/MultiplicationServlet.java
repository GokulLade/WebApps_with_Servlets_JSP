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

@WebServlet("/mul")
public class MultiplicationServlet extends GenericServlet {
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		
		int result=num1*num2;
		
		res.setContentType("text/html");
		
		PrintWriter pw=res.getWriter();
		pw.print("Multiplication of two number is : "+result);
		
		RequestDispatcher rd=req.getRequestDispatcher("index.html");
		rd.include(req, res);
		
	}

}
