package com.mph.servlet;


import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mph.dao.DBConnection;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


/**
 * Servlet implementation class AdminDashboardServlet
 */
@WebServlet("/AdminDashboardServlet")
public class AdminDashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AdminDashboardServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
        if (session == null || !"admin".equals(session.getAttribute("role"))) {
            response.sendRedirect("login.jsp?msg=unauthorized");
            return;
        }
        

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement()) {

            ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM quizzes");
            rs.next();
            int totalQuizzes = rs.getInt(1);

            rs = st.executeQuery("SELECT COUNT(*) FROM questions");
            rs.next();
            int totalQuestions = rs.getInt(1);

            rs = st.executeQuery("SELECT COUNT(*) FROM users");
            rs.next();
            int totalUsers = rs.getInt(1);

            request.setAttribute("totalQuizzes", totalQuizzes);
            request.setAttribute("totalQuestions", totalQuestions);
            request.setAttribute("totalUsers", totalUsers);

        } catch (Exception e) {
            e.printStackTrace();
        }

        request.getRequestDispatcher("admin_dashboard.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
