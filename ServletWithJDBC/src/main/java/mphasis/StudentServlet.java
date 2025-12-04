package mphasis;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class StudentServlet
 */
//@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    private String url;
    private String uname;
    private String pwd;
    public StudentServlet() {
        // TODO Auto-generated constructor stub
    }
   

      @Override
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

          response.setContentType("text/html");
          PrintWriter out = response.getWriter();

          ServletContext ctx = getServletContext();
          String url = ctx.getInitParameter("url");
          String uname = ctx.getInitParameter("uname");
          String pwd = ctx.getInitParameter("pwd");

          String action = request.getParameter("action"); // create, read, update, delete

          try {
              Class.forName("com.mysql.cj.jdbc.Driver");
              try (Connection conn = DriverManager.getConnection(url, uname, pwd)) {

                  if ("create".equalsIgnoreCase(action)) {
                      String name = request.getParameter("name");
                      String email = request.getParameter("email");

                      PreparedStatement ps = conn.prepareStatement(
                    		    "INSERT INTO StudentData(id, name, email) VALUES(?,?,?)"
                    		);
                            ps.setInt(1, Integer.parseInt(request.getParameter("id")));
                    		ps.setString(2, request.getParameter("name"));
                    		ps.setString(3, request.getParameter("email"));
                      int rows = ps.executeUpdate();
                      out.println("<p>Inserted " + rows + " record(s)</p>");

                  } else if ("read".equalsIgnoreCase(action)) {
                      PreparedStatement ps = conn.prepareStatement("SELECT * FROM StudentData");
                      ResultSet rs = ps.executeQuery();
                      out.println("<h2>Student Records</h2>");
                      while (rs.next()) {
                          out.println(rs.getInt("id") + " "
                                  + rs.getString("name") + " "
                                  + rs.getString("email") + "<br>");
                      }

                  } else if ("update".equalsIgnoreCase(action)) {
                      int id = Integer.parseInt(request.getParameter("id"));
                      String name = request.getParameter("name");
                      String email = request.getParameter("email");

                      PreparedStatement ps = conn.prepareStatement("UPDATE StudentData SET name=?, email=? WHERE id=?");
                      ps.setString(1, name);
                      ps.setString(2, email);
                      ps.setInt(3, id);
                      int rows = ps.executeUpdate();
                      out.println("<p>Updated " + rows + " record(s)</p>");

                  } else if ("delete".equalsIgnoreCase(action)) {
                      int id = Integer.parseInt(request.getParameter("id"));

                      PreparedStatement ps = conn.prepareStatement("DELETE FROM StudentData WHERE id=?");
                      ps.setInt(1, id);
                      int rows = ps.executeUpdate();
                      out.println("<p>Deleted " + rows + " record(s)</p>");

                  } else {
                      out.println("<p>Invalid action. Use ?action=create|read|update|delete</p>");
                  }
              }
          } catch (Exception e) {
              e.printStackTrace(out);
          }
      }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
