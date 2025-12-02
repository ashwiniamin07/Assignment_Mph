package com.mph;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserLoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out=response.getWriter();
//		out.println("Login successful");
		String username=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
//		out.println("Login successful for user "+username);
		
//		if(username.equals("admin")&& pwd.equals("12345"))
//		{
//			Cookie ck=new Cookie("user",username);
//			ck.setMaxAge(60*60);
//			response.addCookie(ck);
//			response.sendRedirect("welcome.jsp");
//		}
//		else
//			response.sendRedirect("error.jsp");
		
		
		//using urlweriting
//		if(username.equals("admin")&& pwd.equals("12345")) {
//			response.setContentType("text/html");
//			out.print("<form id='f1' action='welcome.jsp' method='get'>"+"<input type='hidden' name='uname' value="+username+">"
//					+"<input type='submit' value='submit'></form>"
//					+"<script>f1.submit()</script>");
//			//response.sendRedirect("welcome.jsp?uname="+username);
//		}
//			
//		else
//			response.sendRedirect("error.jsp");
		
		
		if(username.equals("admin")&& pwd.equals("12345")) {
			HttpSession session=request.getSession();
			String token=UUID.randomUUID().toString();
			session.setAttribute("token", token);
			session.setAttribute("uname", username);
			RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
