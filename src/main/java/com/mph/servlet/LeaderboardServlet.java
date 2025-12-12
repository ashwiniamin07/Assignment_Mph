package com.mph.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mph.dao.DBConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


/**
 * Servlet implementation class LeaderboardServlet
 */
@WebServlet("/LeaderboardServlet")
public class LeaderboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LeaderboardServlet() {
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

	        int quizId = Integer.parseInt(request.getParameter("quizId"));
	        List<Map<String, Object>> rows = new ArrayList<>();

	        String sql = "SELECT r.user_id, u.name, r.score FROM results r JOIN users u ON r.user_id = u.id WHERE r.quiz_id = ? ORDER BY r.score DESC";
	        try (Connection con = DBConnection.getConnection();
	             PreparedStatement ps = con.prepareStatement(sql)) {
	            ps.setInt(1, quizId);
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	                Map<String, Object> m = new HashMap<>();
	                m.put("userId", rs.getInt("user_id"));
	                m.put("name", rs.getString("name"));
	                m.put("score", rs.getInt("score"));
	                rows.add(m);
	            }
	        } catch (Exception e) { e.printStackTrace(); }

	        request.setAttribute("leaderboard", rows);
	        request.setAttribute("quizId", quizId);
	        request.getRequestDispatcher("leaderboard.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
