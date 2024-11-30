package customerinfo;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.*;

@WebServlet("/display")
public class CustomerDetails implements Servlet {

	@Override
	public void init(ServletConfig arg0) throws ServletException
	{
		//no code
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		    String cname = req.getParameter("cname");
		    String cemail = req.getParameter("cemail");
		    String cphone = req.getParameter("cphone");
		    String caddress = req.getParameter("caddress");
		    String cage = req.getParameter("cage");
		
		    res.setContentType("text/html");
		    
		    PrintWriter pw = res.getWriter();
		    
		    pw.println("<html>");
		    pw.println("<head>");
		    pw.println("<title>Customer Details</title>");
		    pw.println("<style>");
		    pw.println("body { font-family: Arial, sans-serif; background-color: #f4f4f9; margin: 20px; }");
		    pw.println("table { width: 50%; margin: auto; border-collapse: collapse; background: #fff; }");
		    pw.println("th, td { border: 1px solid #ccc; padding: 10px; text-align: left; }");
		    pw.println("th { background-color: #007bff; color: #fff; }");
		    pw.println("td { background-color: #f9f9f9; }");
		    pw.println("h2 { text-align: center; color: #333; }");
		    pw.println("</style>");
		    pw.println("</head>");
		    pw.println("<body>");
		    pw.println("<h2>Customer Details</h2>");
		    pw.println("<table>");
		    pw.println("<tr><th>Field</th><th>Value</th></tr>");
		    pw.println("<tr><td>Customer Name</td><td>" + cname + "</td></tr>");
		    pw.println("<tr><td>Customer Email</td><td>" + cemail + "</td></tr>");
		    pw.println("<tr><td>Customer Phone</td><td>" + cphone + "</td></tr>");
		    pw.println("<tr><td>Customer Address</td><td>" + caddress + "</td></tr>");
		    pw.println("<tr><td>Customer Age</td><td>" + cage + "</td></tr>");
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
