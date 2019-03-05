package test;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UpdateUser
 */
@WebServlet("/UpdateUser")
public class UpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// get all the value first 
				String  name= request.getParameter("name") ; 
				String  password= request.getParameter("password") ; 
				String  sex= request.getParameter("sex") ; 
				String  country= request.getParameter("country") ; 
				String  email= request.getParameter("email") ; 
		 
				
		HttpSession session = request.getSession() ; 
		
		ArrayList<User> users = (ArrayList<User>) session.getAttribute("users") ; 
			
			// remove the existing user
		for(User user : users ) {
			if(user.getEmail().equals(email)) {
				users.remove(user) ; 
				break ; 
			}
		}

			// create new user and wrap it in object ,put in session
			User newUser = new User(name, password, email, sex, country) ; 
			users.add(newUser) ; 
			session.setAttribute("users",users);
 		
		response.sendRedirect("add_user_form.jsp");	 
 	}

}
