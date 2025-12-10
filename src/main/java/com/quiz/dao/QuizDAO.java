package com.quiz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.quiz.model.Quiz;

public class QuizDAO {
	// Add a new quiz
    public boolean addQuiz(Quiz q) {
        String sql = "INSERT INTO quiz (title, category) VALUES (?,?)";

        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, q.getTitle());
            ps.setString(2, q.getCategory());

            return ps.executeUpdate() == 1;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Get all quizzes
    public List<Quiz> getAllQuizzes() {
        List<Quiz> list = new ArrayList<>();
        String sql = "SELECT * FROM quiz";

        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Quiz q = new Quiz();
                q.setId(rs.getInt("id"));
                q.setTitle(rs.getString("title"));
                q.setCategory(rs.getString("category"));
                list.add(q);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // Get quiz by ID
    public Quiz getQuizById(int id) {
        String sql = "SELECT * FROM quiz WHERE id=?";
        Quiz q = null;

        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                q = new Quiz();
                q.setId(rs.getInt("id"));
                q.setTitle(rs.getString("title"));
                q.setCategory(rs.getString("category"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return q;
    }
}
