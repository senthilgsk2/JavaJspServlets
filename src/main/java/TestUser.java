

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		ServletConfig config = getServletConfig();
		String uName = config.getInitParameter("username");
		String uPass = config.getInitParameter("userpass");
		
		out.println("User Name: " +uName +", " +"User Password: "+uPass);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
