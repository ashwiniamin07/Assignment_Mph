package com.quiz.controller;

import java.io.IOException;

import com.quiz.dao.UserDAO;
import com.quiz.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
	 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		    String name = req.getParameter("name");
		    String email = req.getParameter("email");
		    String password = req.getParameter("password");

		    User u = new User();
		    u.setName(name); u.setEmail(email); u.setPassword(password); u.setRole("user");

		    boolean ok = new UserDAO().register(u);
		    if (ok) resp.sendRedirect("index.jsp?reg=success");
		    else resp.sendRedirect("index.jsp?reg=fail");
		  }
}
