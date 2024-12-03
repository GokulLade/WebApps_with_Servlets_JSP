package userinfo;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/userinfo")
public class UserInfo extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		RequestDispatcher rd=req.getRequestDispatcher("UserInfoDisplay.jsp");
		rd.forward(req, res);
	}

}
