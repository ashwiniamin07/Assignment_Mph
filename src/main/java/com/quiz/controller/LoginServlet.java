package com.quiz.controller;

import java.io.IOException;

import com.quiz.dao.UserDAO;
import com.quiz.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		    String email = req.getParameter("email");
		    String password = req.getParameter("password");
		    User u = new UserDAO().login(email, password);
		    if (u != null) {
		      HttpSession s = req.getSession();
		      s.setAttribute("user", u);
		      if ("admin".equals(u.getRole())) resp.sendRedirect("admin/dashboard.jsp");
		      else resp.sendRedirect("user/quiz_list.jsp");
		    } else {
		      resp.sendRedirect("index.jsp?login=fail");
		    }
		  }

}
