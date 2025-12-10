package com.quiz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.quiz.model.User;

public class UserDAO {
	public boolean register(User u) {
	    try (Connection c = DBConnection.getConnection();
	         PreparedStatement ps = c.prepareStatement("INSERT INTO users (name,email,password,role) VALUES (?,?,?,?)")) {
	       ps.setString(1, u.getName());
	       ps.setString(2, u.getEmail());
	       ps.setString(3, u.getPassword());
	       ps.setString(4, u.getRole());
	       return ps.executeUpdate() == 1;
	    } catch(Exception e){ e.printStackTrace(); return false; }
	  }

	  public User login(String email, String password){
	    try (Connection c = DBConnection.getConnection();
	         PreparedStatement ps = c.prepareStatement("SELECT * FROM users WHERE email=? AND password=?")) {
	       ps.setString(1, email); ps.setString(2, password);
	       ResultSet rs = ps.executeQuery();
	       if (rs.next()) {
	         User u = new User();
	         u.setId(rs.getInt("id"));
	         u.setName(rs.getString("name"));
	         u.setEmail(email);
	         u.setRole(rs.getString("role"));
	         return u;
	       }
	    } catch(Exception e){ e.printStackTrace(); }
	    return null;
	  }
}
