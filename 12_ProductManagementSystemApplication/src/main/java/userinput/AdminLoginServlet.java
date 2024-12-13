package userinput;

import java.io.IOException;

import databaseoperation.AdminloginDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import javabean.AdminBean;

@SuppressWarnings("serial")
@WebServlet("/adminlogin")
public class AdminLoginServlet extends HttpServlet {
	
	public AdminloginDAO ad=null;
	
	@Override
	public void init()
	{
		ad=new AdminloginDAO();
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		AdminBean ab=ad.login(username, password);
		
		if(ab==null)
		{
			req.setAttribute("msg", "Invalid login process..<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else
		{
			//Creating new session
			HttpSession hs=req.getSession();
			
			//Admin bean adding to session
			hs.setAttribute("adminbean", ab);
			
			req.getRequestDispatcher("AdminLogigSuccess.jsp").forward(req, res);
		}
	}

}
