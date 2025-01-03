package displayinfo;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/display")
public class BookDetails implements Servlet {

	@Override
	public void init(ServletConfig arg0) throws ServletException 
	{
		//no code
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		String bcode = req.getParameter("bcode");
	    String bname = req.getParameter("bname");
	    String bauthor = req.getParameter("bauthor");
	    String bprice = req.getParameter("bprice");
	    String bqty = req.getParameter("bqty");
	    
	    res.setContentType("text/html");
	    
	    PrintWriter pw = res.getWriter();
	    
	    // Write the HTML table to display the data
	    pw.println("<html>");
	    pw.println("<head><title>Book Details</title></head>");
	    pw.println("<body>");
	    pw.println("<h2>Book Details</h2>");
	    pw.println("<table border='1'>");
	    pw.println("<tr><th>Field</th><th>Value</th></tr>");
	    pw.println("<tr><td>BCODE</td><td>" + bcode + "</td></tr>");
	    pw.println("<tr><td>BNAME</td><td>" + bname + "</td></tr>");
	    pw.println("<tr><td>BAUTHOR</td><td>" + bauthor + "</td></tr>");
	    pw.println("<tr><td>BPRICE</td><td>" + bprice + "</td></tr>");
	    pw.println("<tr><td>BQTY</td><td>" + bqty + "</td></tr>");
	    pw.println("</table>");
	    pw.println("</body>");
	    pw.println("</html>");
	}

	@Override
	public void destroy() 
	{
		//no code
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
