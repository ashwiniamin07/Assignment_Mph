package com.mph.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
//@WebServlet("/submitQuiz")
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
	    HttpSession session = request.getSession(false);
        User user = (User) session.getAttribute("user");
        if (user == null) { response.sendRedirect("login.jsp"); return; }

        int quizId = Integer.parseInt(request.getParameter("quizId"));
        QuestionDAO qdao = new QuestionDAO();
        List<Question> questions = qdao.getQuestionsByQuiz(quizId);

        int score = 0;
        Map<Integer, String> userAnswers = new HashMap<>();

        for (Question q : questions) {
            String userAns = request.getParameter("q" + q.getId());
            userAnswers.put(q.getId(), userAns == null ? "" : userAns);
            if (userAns != null && userAns.equalsIgnoreCase(q.getCorrectAns())) {
                score++;
            }
        }

        // save result
        Result r = new Result();
        r.setUserId(user.getId());
        r.setQuizId(quizId);
        r.setScore(score);
        ResultDAO resultDAO = new ResultDAO();
        resultDAO.saveResult(r);

        // forward to review page which highlights correct/incorrect answers
        request.setAttribute("questions", questions);
        request.setAttribute("userAnswers", userAnswers);
        request.setAttribute("score", score);
        request.getRequestDispatcher("result_review.jsp").forward(request, response);
	}

}
