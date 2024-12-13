package userinput;

import java.io.IOException;

import databaseoperation.UpdateProfileDAO;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javabean.UserDataBean;


@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProfileServlet extends HttpServlet {
	
	UpdateProfileDAO ud=null;
	
	@Override
	public void init()
	{
		ud=new UpdateProfileDAO();
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		Cookie c[] = req.getCookies();
		
		if(c==null) 
		{
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else 
		{
			String fName = c[0].getValue();
			req.setAttribute("fname", fName);
			ServletContext sct = req.getServletContext();
			
			//Accessing ServletContext Object reference
			UserDataBean ub = (UserDataBean)sct.getAttribute("ubean");
			ub.setCity(req.getParameter("city"));
			ub.setMid(req.getParameter("mid"));
			ub.setPhno(Long.parseLong(req.getParameter("phno")));

			int k = ud.update(ub);
			if(k>0) 
			{
				req.setAttribute("msg","Profile Updated Successfully...<br>");
				req.getRequestDispatcher("ViewProfile.jsp").forward(req, res);
			}
		}
		
	}

}
