package com.mph.servlet;

import java.io.IOException;

import com.mph.dao.QuizDAO;
import com.mph.model.Quiz;
import com.mph.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


/**
 * Servlet implementation class CreateQuizServlet
 */
@WebServlet("/CreateQuizServlet")
public class CreateQuizServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CreateQuizServlet() {
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
	      HttpSession session = request.getSession();
	        User user = (User) session.getAttribute("user");

	        if (user == null) {
	        	response.sendRedirect("login.jsp");
	            return;
	        }

	        String title =request.getParameter("title");

	        Quiz quiz = new Quiz();
	        quiz.setTitle(title);
	        quiz.setCreatedBy(user.getId());

	        QuizDAO dao = new QuizDAO();

	        if (dao.createQuiz(quiz)) {
	        	response.sendRedirect("dashboard.jsp?msg=quiz_created");
	        } else {
	        	response.sendRedirect("createQuiz.jsp?msg=failed");
	        }
	}

}
