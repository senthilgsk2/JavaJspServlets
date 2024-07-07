

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterServ extends HttpServlet {
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
		String name = request.getParameter("usernames");
		String username = request.getParameter("user_name");
		String password = request.getParameter("pass");
		
		try {
			PreparedStatement  pst = con.prepareStatement("insert into users values("+"'"+name+"'"+","+"'"+username+"'"+","+"'"+password+"'"+")");
			pst.executeUpdate();
			out.println("<h1>Register Success</h1>");
			out.println("Click to Login <a href=\"/DevJava/Login.jsp\">Login</a>");
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
