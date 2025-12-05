package com.mphasis;

import jakarta.servlet.AsyncContext;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



@WebServlet(urlPatterns="/AsyncServlet",asyncSupported=true)
public class AsyncServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
	private static final ExecutorService executor=Executors.newFixedThreadPool(3);
	
	
	
    public AsyncServlet() {
        super();
        
    }

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		executor.shutdown();
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());
		AsyncContext ac=request.startAsync();
		executor.submit(()->{
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());
				String uname=request.getParameter("uname");
				String pwd=request.getParameter("pwd");
				if(uname.equals("ashwini") && pwd.equals("12345")) {
					response.getWriter().println("Authentication successful,Asynchronous ok");
				}
				else {
					response.getWriter().println("Invalid credemntials,Async not ok");
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			} finally {
				ac.complete();
			}
		});
	}

}
