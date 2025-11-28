package com.mph.JDBCProj;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import java.sql.Statement;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded");
        String uname="root";
        String pwd="root@39";
        String url="jdbc:mysql://localhost:3306/mph25";
       
        System.out.println("Connection Established");
        
        String query="select * from emptable";
        
        
        try( Connection con=DriverManager.getConnection(url,uname,pwd);
        		Statement st=con.createStatement();
        		ResultSet rs=st.executeQuery(query);){
        	  ResultSetMetaData rsmd=rs.getMetaData();
        	  int columnsCount=rsmd.getColumnCount();
        	  for(int i=1;i<=columnsCount;i++) {
        		  System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnClassName(i));
        		  
        	  }
        	  System.out.println("----------------------------------");
        	  while(rs.next()) {
//              	System.out.println("EmployeeId:"+rs.getInt(1));
//              	System.out.println("Employee Name:"+rs.getString(2));
//              	System.out.println("Employee Mobile:"+rs.getString(3));
//              	System.out.println("Employee Address:"+rs.getString(4));
//              	System.out.println("Employee Did:"+rs.getInt(5));
//              	System.out.println("Employee Age:"+rs.getInt(6));
//              	System.out.println("Employee Mail:"+rs.getString(7));
//              	System.out.println("----------------------------------");
        	  		for(int i=1;i<=columnsCount;i++) 
        	  			System.out.println(rsmd.getColumnName(i)+" : "+rs.getString(rsmd.getColumnName(i)));
        	  		System.out.println("----------------------------------");
              }
        	  
        	  
        	  DatabaseMetaData dbmd=con.getMetaData();
        	  System.out.println(dbmd.getDatabaseProductName());
        	  ResultSet rs1=dbmd.getTables(null, null, "%", new String[] {"TABLE"});
        	  while(rs1.next()) {
        		  System.out.println(rs1.getString("TABLE_NAME"));
        	  }
        	  rs1.close();
              
        }catch(Exception e) {
        	e.printStackTrace();
        }
      
    }
}
