package test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		try
        {
		  String  username="root" ; 
	      String password=""; 
	      String  url="jdbc:mysql://localhost/bookstore" ;
	      String DB_DRIVER="com.mysql.jdbc.Driver" ;
	      
	      Connection conn=null ; 
	            
	      Class.forName(DB_DRIVER) ; 
	      conn=DriverManager.getConnection(url,username,password) ; 
	      
	      if(conn!=null)
	    	  System.out.println("Succesfull");
	      else
	    	  System.out.println("fail");
	      }
	      catch(Exception e){
	    	  	e.printStackTrace();	      }
	       
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
        {
			System.out.println("Post");
		  String  username="root" ; 
	      String password="root"; 
	      String  url="jdbc:mysql://localhost/Bookstore" ;
	      String DB_DRIVER="com.mysql.jdbc.Driver" ;
	      
	      Connection conn=null ; 
	            
	      Class.forName(DB_DRIVER) ; 
	      conn=DriverManager.getConnection(url,username,password) ; 
	      
	      if(conn!=null)
	    	  System.out.println("Succesfull");
	      else
	    	  System.out.println("fail");
	      }
	      catch(Exception e){
	    	  	e.printStackTrace();	      }
	}

}
