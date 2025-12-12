package com.mph.servlet;

import java.io.IOException;

import com.mph.dao.QuestionDAO;
import com.mph.model.Question;
import com.mph.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


/**
 * Servlet implementation class AddQuestionServlet
 */
//@WebServlet("/addQuestion")
public class AddQuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddQuestionServlet() {
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
	        if (session == null || !"admin".equals(session.getAttribute("role"))) {
	            response.sendRedirect("login.jsp?msg=unauthorized");
	            return;
	        }

//	        User user = (User) session.getAttribute("user");
//	        if (user == null) { response.sendRedirect("login.jsp"); return; }
		int quizId = Integer.parseInt(request.getParameter("quizId"));
        String q = request.getParameter("question");
        String a =request.getParameter("optionA");
        String b = request.getParameter("optionB");
        String c = request.getParameter("optionC");
        String d = request.getParameter("optionD");
        String ans = request.getParameter("correctAns");

        Question question = new Question();
        question.setQuizId(quizId);
        question.setQuestion(q);
        question.setOptionA(a);
        question.setOptionB(b);
        question.setOptionC(c);
        question.setOptionD(d);
        question.setCorrectAns(ans);

        QuestionDAO dao = new QuestionDAO();

        if (dao.addQuestion(question)) {
        	response.sendRedirect("addQuestion.jsp?quizId=" + quizId + "&msg=added");
        } else {
        	response.sendRedirect("addQuestion.jsp?quizId=" + quizId + "&msg=failed");
        }
    }
	}


