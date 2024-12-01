package ArithmaticOperation;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")

@WebServlet("/choice")
public class TakeChoice extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		String choice=req.getParameter("operation");
		
		if(choice.equals("add"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("add");
			rd.forward(req, res);
		}
		else if(choice.equals("subtract"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("sub");
			rd.forward(req, res);
		}
		else if(choice.equals("multiply"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("mul");
			rd.forward(req, res);
		}
		else if(choice.equals("divide"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("div");
			rd.forward(req, res);
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("mood");
			rd.forward(req, res);
		}
		
	}

}
