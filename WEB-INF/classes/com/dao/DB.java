package com.dao;

import java.sql.*;

public class DB {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String URL = "jdbc:mysql://localhost:3306/deliverable3";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "akash";
	
	public static Connection getCon() throws ClassNotFoundException, SQLException
	{
	   Connection conn=null;
	   
	   Class.forName(JDBC_DRIVER);
	   
	   conn= DriverManager.getConnection(URL,USER,PASS);
	   
	   System.out.println("connection" + conn);
	   
	   return conn;
	   
	   }

}
