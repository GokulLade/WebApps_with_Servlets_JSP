package userinput;

import java.io.IOException;
import java.io.PrintWriter;

import databaseoperation.AddUserDetailDAO;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import javabean.UserDataBean;

@SuppressWarnings("serial")

@WebServlet("/register")
public class RegisterServlet extends GenericServlet {

	UserDataBean ub=null;
	AddUserDetailDAO ad=null;
	RequestDispatcher rd=null;
	@Override
	public void init()
	{
		ub=new UserDataBean();
		ad=new AddUserDetailDAO();
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		ub.setUserName(req.getParameter("name"));
		ub.setPass(req.getParameter("pass"));
		ub.setFname(req.getParameter("fname"));
		ub.setLname(req.getParameter("lname"));
		ub.setCity(req.getParameter("city"));
		ub.setMid(req.getParameter("email"));
		ub.setPhno(Long.parseLong(req.getParameter("phno")));
		
		int result =ad.addData(ub);
		
		if(result>0)
		{
			req.setAttribute("username", ub.getUserName());
			
			rd=req.getRequestDispatcher("UserRegister.jsp");
			rd.forward(req, res);
		}
		else
		{
			res.setContentType("text/html");
			
			PrintWriter pw=res.getWriter();
			pw.print("Something is wrong try again..!");
			
			rd=req.getRequestDispatcher("register.html");
			rd.include(req, res);
		}
		
	}

}
