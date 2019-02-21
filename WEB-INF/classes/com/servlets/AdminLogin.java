package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
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
		
		
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String n=request.getParameter("email");
			String p=request.getParameter("password");
			
			if(n.equals("admin")&&p.equals("admin")){  
				HttpSession session=request.getSession(true); 
				session.setAttribute("email", n);
			    RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
			    rd.forward(request,response);  
			}  
			else{  
			    RequestDispatcher rd=request.getRequestDispatcher("admin.jsp");  
			    rd.include(request,response);  
			    out.println("<p>Sorry username or password error<p>");
			}
			out.close();
		} 
	}


