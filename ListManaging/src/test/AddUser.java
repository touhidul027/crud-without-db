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
 * Servlet implementation class AddUser
 */
@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// get all the value first 
		String  name= request.getParameter("name") ; 
		String  password= request.getParameter("password") ; 
		String  sex= request.getParameter("sex") ; 
		String  country= request.getParameter("country") ; 
		String  email= request.getParameter("email") ; 
 
		// wrap it in object 
		User user = new User(name, password, email, sex, country) ; 
		
		// get or create a session 
		HttpSession session = request.getSession() ; 
		ArrayList<User> users = (ArrayList<User>) session.getAttribute("users") ; 
		
		if( users!=null && users.isEmpty()==false ) {
			users.add(user) ; 
			//System.out.println("a");
		}else {
			users = new ArrayList<User>() ; 
			users.add(user) ; 
			//System.out.println("b");
		}		
		session.setAttribute("users", users);
		
		//for(User userd : users)
		//	System.out.println(userd);
		
	    response.sendRedirect("add_user_form.jsp");
	}

}
