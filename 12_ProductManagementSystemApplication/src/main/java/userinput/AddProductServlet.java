package userinput;

import java.io.IOException;

import databaseoperation.AddProductDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import javabean.ProductBean;

@SuppressWarnings("serial")
@WebServlet("/addproduct")
public class AddProductServlet extends HttpServlet {
	
	public ProductBean pb = null;
	public AddProductDAO apd = null;
	
	@Override
	public void init() throws ServletException
	{
		pb=new ProductBean();
		apd= new AddProductDAO();
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		//Accessing existing Session
		HttpSession hs = req.getSession(false);
		
		if(hs==null)
		{
			req.setAttribute("msg","Sessioin Expired....<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}
		else
		{
			pb.setCode(req.getParameter("code"));
			pb.setName(req.getParameter("name"));
			pb.setPrice(Float.parseFloat(req.getParameter("price")));
			pb.setQty(Integer.parseInt(req.getParameter("qty")));
			int k = apd.insertProduct(pb,req,res);
		
			if(k>0) 
			{
				req.setAttribute("msg", "Product Added Successfully....<br>");
				req.getRequestDispatcher("AddProduct.jsp").forward(req, res);
			}
		
		}
		
	}

}
