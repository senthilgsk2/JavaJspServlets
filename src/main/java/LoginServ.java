

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	
	public void init() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_servelet", "root", "sk123");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		try {
			PreparedStatement pst = con.prepareStatement("select * from users where user_name = " +"\""+username+"\""+ "and "+"pass = "+"\""+password+"\"");
			ResultSet result = pst.executeQuery();
			if(result.next()) {
				String users = result.getString("usernames");
				out.println("<h1>Logged Success</h1>");
				out.println("<h1>"+"Welcome da dai... "+users+"</h1>");
			}
			else {
				out.println("<h1>Logged Failed</h1>");
				out.println("Click to Login <a href=\"/DevJava/Login.jsp\">Try Login Again</a>");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	public void close() {
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
