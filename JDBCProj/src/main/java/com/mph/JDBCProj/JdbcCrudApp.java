package com.mph.JDBCProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCrudApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.cj.jdbc.Driver");
	        String uname="root";
	        String pwd="root@39";
	        String url="jdbc:mysql://localhost:3306/mph25";
	       
	        
	        
	        try( Connection con=DriverManager.getConnection(url,uname,pwd);
	        		Statement st=con.createStatement();
	        		ResultSet rs=st.executeQuery( "select * from emptable");){
	        	//inserting record
//	        	String query="insert into emptable values(?,?,?,?,?,?,?)";
//	        	PreparedStatement ps=con.prepareStatement(query);
//	        	ps.setInt(1,67911);
//	        	ps.setString(2, "anu11");
//	        	ps.setString(3, "9996551043");
//	        	ps.setString(4, "London");
//	        	ps.setInt(5, 1);
//	        	ps.setInt(6, 36);
//	        	ps.setString(7, "anvitha11@gmail.com");
//	        	ps.executeUpdate();
//	        	System.out.println("row inserted successfully....");
	        	
	        	//read records
//	        	ResultSetMetaData rsmd=rs.getMetaData();
//	        	int columnsCount=rsmd.getColumnCount();
//	        	while(rs.next()) {
//	        		for(int i=1;i<=columnsCount;i++) 
//	    	  			System.out.println(rsmd.getColumnName(i)+" : "+rs.getString(rsmd.getColumnName(i)));
//	    	  		System.out.println("----------------------------------");
//	        	}
	        
	        	//update records
	        	String query1="update emptable set mobile=? where employeeid=?";
	        	PreparedStatement ps1=con.prepareStatement(query1);
	        	ps1.setString(1, "9743172274");
	        	ps1.setInt(2, 678);
	        	ps1.executeUpdate();
	        	System.out.println("row updated successfully");
	        	ResultSetMetaData rsmd=rs.getMetaData();
	        	int columnsCount=rsmd.getColumnCount();
	        	while(rs.next()) {
	        		for(int i=1;i<=columnsCount;i++) 
	    	  			System.out.println(rsmd.getColumnName(i)+" : "+rs.getString(rsmd.getColumnName(i)));
	    	  		System.out.println("----------------------------------");
	        	}
	        	
	        }

	}

}
