package servlet;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.registerUser;
import entity.User;

@WebServlet("/register")

public class registerServlet extends HttpServlet {
	public registerServlet()
	{
		super();
	}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
	String email = request.getParameter("email");
	String firstName = request.getParameter("firstname");
	String lastName = request.getParameter("lastname");
	String accountType = "Admin";
	String password = request.getParameter("password");
	
	registerUser r = new registerUser();
	User u = new User(email,firstName,lastName,accountType,password);
	r.addUser(u);
}


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	doPost(request, response);
	
}
}
