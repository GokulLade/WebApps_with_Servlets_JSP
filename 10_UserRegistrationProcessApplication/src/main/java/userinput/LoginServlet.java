package userinput;

import java.io.IOException;
import databaseoperation.CheckUserLoginDAO;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javabean.UserDataBean;

@SuppressWarnings("serial")

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	CheckUserLoginDAO ch=null;
	
	@Override
	public void init()
	{
		ch=new CheckUserLoginDAO();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		
		UserDataBean ub=ch.checkLogin(req.getParameter("name"),req.getParameter("pass"));
		
		if(ub!=null)
		{
			req.setAttribute("username", ub.getFname());
			ServletContext sct = req.getServletContext(); //Accessing ServletContext object reference
			sct.setAttribute("ubean", ub);
			
			Cookie ck = new Cookie("fn",ub.getFname());
			res.addCookie(ck);//Adding Cookie Object to response. This method converts Cookie Object into Stream
			
			req.getRequestDispatcher("WelcomePage.jsp").forward(req, res);
		}
		
		else
		{
			req.setAttribute("msg","User Name and Password is incorrect");
			
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
	}

}
