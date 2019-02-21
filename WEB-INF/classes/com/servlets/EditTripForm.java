package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.*;
import com.dao.*;


@WebServlet("/EditTripForm")
public class EditTripForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	//Servlet that takes librarian id and displays form to edit of that particular librarian. On submit this servlet calls EditLibrarian servlet.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.println("<head>");
		out.println("<title>View Trip</title>");
		out.println("<link rel='stylesheet' href='styles/main.css'/>");
		out.println("</head>");
		out.println("<body>");
		request.getRequestDispatcher("header.jsp").include(request, response);
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		TripBean bean=Trip.viewById(id);
		
		out.print("<form action='EditTrip' method='post' style='width:300px'>");
		
		out.print("<label for='name1'>Event ID</label>");
		out.print("<input type='text' name='eventid' value='"+bean.getEventid()+"'/>");
		
		out.print("<label for='email1'>Event Category</label>");
		out.print("<input type='text'  value='"+bean.getEventCategory()+"' name='category' />");
		
		out.print("<label for='name1'>Depart Date</label>");
		out.print("<input type='text' name='ddate' value='"+bean.getDepartDate()+"'/>");
		
		out.print("<label for='name1'>Return Date</label>");
		out.print("<input type='text' name='rdate' value='"+bean.getReturnDate()+"'/>");
		
		out.print("<label for='name1'>Charge</label>");
		out.print("<input type='text' name='charge' value='"+bean.getCharge()+"'/>");
		
		
		out.print("<button type='submit' class='btn btn-primary'>Update</button>");
		out.print("</form>");
		
		
		
		out.close();
	}



}
