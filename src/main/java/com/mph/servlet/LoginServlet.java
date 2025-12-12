package com.mph.servlet;

import java.io.IOException;

import com.mph.dao.UserDAO;
import com.mph.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
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
		 String email =request.getParameter("email");
	        String password =request.getParameter("password");

	        UserDAO dao = new UserDAO();
	        User u = dao.login(email, password);

	        if (u != null) {
	            HttpSession session = request.getSession();
	            session.setAttribute("user", u);

	            if (u.getRole().equals("admin")) {
	                response.sendRedirect("admin_dashboard.jsp");
	            } else {
	                response.sendRedirect("dashboard.jsp");
	            }
	        } else {
	            response.sendRedirect("login.jsp?msg=invalid");
	        }
	}

}
