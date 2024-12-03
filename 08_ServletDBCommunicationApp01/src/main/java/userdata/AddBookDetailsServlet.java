package userdata;

import java.io.IOException;
import java.io.PrintWriter;

import databaseoperation.AddBookDetailsDAO;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import javabean.BookBean;

@SuppressWarnings("serial")

@WebServlet("/add")
public class AddBookDetailsServlet extends GenericServlet {

	public BookBean bb=null;
	public AddBookDetailsDAO ad=null;
	RequestDispatcher rd=null;
	
	@Override
	public void init()
	{
		bb=new BookBean();
		ad=new AddBookDetailsDAO();
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		bb.setCode(req.getParameter("code"));
		bb.setName(req.getParameter("name"));
		bb.setAuthor(req.getParameter("author"));
		bb.setPrice(Float.parseFloat(req.getParameter("price")));
		bb.setQty(Integer.parseInt(req.getParameter("qty")));
		
		int result=ad.insertBookDetail(bb);
		
		if(result>0)
		{
			 rd=req.getRequestDispatcher("AddBookDetails.jsp");
			 rd.forward(req, res);
		}
		else
		{
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			pw.print("Something is wrong try again");
			
			rd=req.getRequestDispatcher("book.html");
			rd.include(req, res);
		}
	}

}
