package userinput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import javabean.ProductBean;

@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditProductServlet extends HttpServlet {

	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession hs = req.getSession(false);//Accessing Existing Session
		if(hs==null) 
		{
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else
		{
		ArrayList<ProductBean> al = (ArrayList<ProductBean>)hs.getAttribute("alist");
		String pC = req.getParameter("pcode");
		Iterator<ProductBean> it = al.iterator();
		
			while(it.hasNext())
	
			{
				ProductBean pb = (ProductBean)it.next();
				if(pC.equals(pb.getCode()))
				{
					req.setAttribute("pbean", pb);
					req.getRequestDispatcher("EditProduct.jsp").forward(req, res);
					break;
				}
			}
		}
		
	}


}
