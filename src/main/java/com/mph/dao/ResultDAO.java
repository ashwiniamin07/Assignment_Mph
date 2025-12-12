package com.mph.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mph.model.Result;

public class ResultDAO {

    public boolean saveResult(Result r) {
        String sql = "INSERT INTO results(user_id, quiz_id, score) VALUES(?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, r.getUserId());
            ps.setInt(2, r.getQuizId());
            ps.setInt(3, r.getScore());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
