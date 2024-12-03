package bookservlets;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")

@WebServlet("/display")
public class BookDetailsServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		RequestDispatcher rd=req.getRequestDispatcher("Display.jsp");
		rd.forward(req, res);
	}

}
