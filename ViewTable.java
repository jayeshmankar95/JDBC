package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewTable {
	public static void main(String[] args) {
try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jayesh","root","jayesh@123");
		
		PreparedStatement ps=con.prepareStatement("select * from employee2");
		
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		}
		con.close();
		
	} 
catch (Exception e) 
	{
	System.out.println(e);
	}

	}

}
