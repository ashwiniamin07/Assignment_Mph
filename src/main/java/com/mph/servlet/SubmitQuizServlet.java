package com.mph.servlet;

import java.io.IOException;
import java.util.List;

import com.mph.dao.QuestionDAO;
import com.mph.dao.ResultDAO;
import com.mph.model.Question;
import com.mph.model.Result;
import com.mph.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


/**
 * Servlet implementation class SubmitQuizServlet
 */
@WebServlet("/SubmitQuizServlet")
public class SubmitQuizServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SubmitQuizServlet() {
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

        int quizId = Integer.parseInt(request.getParameter("quizId"));

        QuestionDAO questionDAO = new QuestionDAO();
        List<Question> questions = questionDAO.getQuestionsByQuiz(quizId);

        int score = 0;

        for (Question q : questions) {
            String userAns = request.getParameter("q" + q.getId());
            if (userAns != null && userAns.equals(q.getCorrectAns())) {
                score++;
            }
        }

        Result r = new Result();
        r.setUserId(user.getId());
        r.setQuizId(quizId);
        r.setScore(score);

        ResultDAO resultDAO = new ResultDAO();
        resultDAO.saveResult(r);

        response.sendRedirect("result.jsp?score=" + score);
	}

}
