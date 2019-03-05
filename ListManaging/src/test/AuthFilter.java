package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AuthFilter
 */

public class AuthFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AuthFilter() {
        // TODO Auto-generated constructor stub
    	
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("#########################");
		System.out.println("Authentication filter");
		// get mail first to see its already present 
		String  email= request.getParameter("email") ;
		
		HttpSession session = ((HttpServletRequest) request).getSession() ; 
		ArrayList<User> users = (ArrayList<User>) session.getAttribute("users") ; 
		
		boolean auth = true ; 
		
		if(users!=null) {
			for(User user : users ) {
				if(user.getEmail().equals(email)) {
					auth= false ; 
					break ; 
				}
			}
		}
		
 		if(auth==false)
			((HttpServletResponse) response).sendRedirect("add_user_form.jsp");
 		else 
 			chain.doFilter(request, response);
 			

		
		

		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("-----------------------");
		System.out.println("Auth filter is initialized.");
		System.out.println("-----------------------");
	}

}
