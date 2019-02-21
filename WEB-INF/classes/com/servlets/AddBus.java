package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.BusBean;
import com.beans.TripBean;
import com.dao.Trip;

/**
 * Servlet implementation class AddBus
 */
@WebServlet("/AddBus")
public class AddBus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBus() {
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
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try{
		String busid=request.getParameter("busid");  
		String capacity=request.getParameter("capacity");  
		String model=request.getParameter("model");  
		String make=request.getParameter("make");  
		
		
		BusBean bean=new BusBean(busid,capacity,model,make);
		Trip.save(bean);
		request.getRequestDispatcher("addbus.jsp").include(request, response);
		out.print("<h4>Bus added successfully</h4>");
		}
		catch(Exception e){
			
		}
	}

}
