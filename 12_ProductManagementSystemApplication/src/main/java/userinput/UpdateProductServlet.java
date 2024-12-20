package userinput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import databaseoperation.UpdateProductDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import javabean.ProductBean;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProductServlet extends HttpServlet {

	public UpdateProductDAO upd = null;
	public void init() throws ServletException
	{
		upd = new UpdateProductDAO();
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession hs = req.getSession(false);
		
		if(hs==null) 
		{
			req.setAttribute("msg","Session Expired...<br>");
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
					pb.setPrice(Float.parseFloat(req.getParameter("price")));
					pb.setQty(Integer.parseInt(req.getParameter("qty")));
					int k = upd.update(pb);
					if(k>0)
					{
					req.setAttribute("msg", "Product Updated Successfully...<br>");
			
					req.getRequestDispatcher("UpdateProduct.jsp").forward(req, res);
		
				}//end of if
				break;
				}//end of if
			}//end of loop
		}
	}

}
