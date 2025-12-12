package com.mph.servlet;

import java.io.IOException;
import java.util.List;

import com.mph.dao.QuestionDAO;
import com.mph.model.Question;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class StartQuizServlet
 */
@WebServlet("/StartQuizServlet")
public class StartQuizServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public StartQuizServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int quizId = Integer.parseInt(request.getParameter("quizId"));

	        QuestionDAO dao = new QuestionDAO();
	        List<Question> list = dao.getQuestionsByQuiz(quizId);

	        request.setAttribute("questions", list);
	        request.setAttribute("quizId", quizId);

	        RequestDispatcher rd = request.getRequestDispatcher("takeQuiz.jsp");
	        rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
