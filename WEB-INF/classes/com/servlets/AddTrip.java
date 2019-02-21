package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import com.beans.TripBean;

import com.dao.Trip;

/**
 * Servlet implementation class AddTrip
 */
@WebServlet("/AddTrip")
public class AddTrip extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTrip() {
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
		String departdate=request.getParameter("ddate");  
		String returndate=request.getParameter("rdate");
		int eventid=Integer.parseInt(request.getParameter("eventid"));
		String eventCategory=request.getParameter("category");
		
		
		int charge=Integer.parseInt(request.getParameter("charge"));
		
		TripBean bean=new TripBean(eventid, charge, eventCategory, departdate, returndate);
		Trip.save(bean);
		request.getRequestDispatcher("index.jsp").include(request, response);
		out.print("<h4>Trip added successfully</h4>");
		}
		catch(Exception e){
			
		}
	}

}
