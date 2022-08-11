package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemoConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("com.mysql.cj.jdbc.Driver");																//1
			
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jayesh","root","jayesh@123");	//2
	
	Statement st=con.createStatement();																		//3
	
	st.executeUpdate("create table employee2(sr int,ename varchar(20),ecity varchar(20),egender varchar(20),ecompany varchar(10));");
																											//4
	System.out.println("table is created");
	con.close();																							//5  
		} 
		catch (Exception e)
			{
			System.out.println(e);
			}

	}

}
