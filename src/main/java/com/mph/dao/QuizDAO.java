package com.mph.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import com.mph.model.Quiz;


public class QuizDAO {
	public boolean createQuiz(Quiz q) {
        String sql = "INSERT INTO quizzes(title, created_by) VALUES(?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, q.getTitle());
            ps.setInt(2, q.getCreatedBy());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // Get all quizzes
    public List<Quiz> getAll() {
        List<Quiz> list = new ArrayList<>();
        String sql = "SELECT * FROM quizzes";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Quiz q = new Quiz();
                q.setId(rs.getInt("id"));
                q.setTitle(rs.getString("title"));
                q.setCreatedBy(rs.getInt("created_by"));
                list.add(q);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
