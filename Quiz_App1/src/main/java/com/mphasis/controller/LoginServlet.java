package com.mphasis.controller;

import java.io.IOException;

import com.mphasis.dao.UserDAO;
import com.mphasis.model.User;

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
		String email = request.getParameter("email");
	    String password = request.getParameter("password");
	    User u = new UserDAO().login(email, password);
	    if (u != null) {
	      HttpSession s = request.getSession();
	      s.setAttribute("user", u);
	      if ("admin".equals(u.getRole())) response.sendRedirect("admin/add_question.jsp");
	      else response.sendRedirect("user/attempt_quiz.jsp");
	    } else {
	    	response.sendRedirect("index.jsp?login=fail");
	    }
	  }

}
