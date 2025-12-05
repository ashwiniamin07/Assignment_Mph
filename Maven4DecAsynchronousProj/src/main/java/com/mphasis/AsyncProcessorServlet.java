package com.mphasis;

import jakarta.servlet.AsyncContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Servlet implementation class AsyncProcessorServlet
 */
@WebServlet(urlPatterns="/AsyncProcessorServlet",asyncSupported=true)
public class AsyncProcessorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final ExecutorService executor=Executors.newSingleThreadExecutor();

    /**
     * Default constructor. 
     */
    public AsyncProcessorServlet() {
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
		 AsyncContext ac = request.startAsync();

	        executor.submit(() -> {
	            try {
	                // Simulate processing delay
	                Thread.sleep(2000);

	                // Get input text
	                String input = request.getParameter("text");
	                if (input == null) input = "";

	                // Process: uppercase + reverse
	                String processed = new StringBuilder(input.toUpperCase()).reverse().toString();

	                // Write response
	                response.setContentType("text/plain");
	                response.getWriter().println("Processed Result: " + processed);

	            } catch (Exception e) {
	                e.printStackTrace();
	            } finally {
	                ac.complete(); // ✅ Important: complete async context
	            }
	        });
	}

}
