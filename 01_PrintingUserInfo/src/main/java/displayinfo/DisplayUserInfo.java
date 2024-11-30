package displayinfo;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.*;

@WebServlet("/display")
public class DisplayUserInfo implements Servlet {


	@Override
	public void init(ServletConfig arg0) throws ServletException 
	{
		
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		String name=req.getParameter("userName");
		String mail=req.getParameter("userEmail");
		long phNumber=Long.parseLong(req.getParameter("userPhoneNumber"));
		
		PrintWriter pw= res.getWriter();
		res.setContentType("text/html");
		
		pw.println("------------------ User Details are --------------------<br>");
		pw.println("User Name is : "+name+"<br>");
		pw.println("User Email is : "+mail+"<br>");
		pw.println("User Phone number is : "+phNumber+"<br>");
		
	}
	
	@Override
	public void destroy() 
	{
		
	}

	@Override
	public ServletConfig getServletConfig()
	{
		
		return null;
	}

	@Override
	public String getServletInfo()
	{
		
		return null;
	}

}
