package ArithmaticOperations;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/choice")
public class TakeChoice extends GenericServlet 
{
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		String choice=req.getParameter("s1");
		
		if(choice.equals("Avg"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("/avg");
			rd.forward(req, res);
		}
		else if(choice.equals("Greater"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("/gl");
			rd.forward(req, res);
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("/sm");
			rd.forward(req, res);
		}
		
	}
	
}
