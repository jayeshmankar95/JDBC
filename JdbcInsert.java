package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JdbcInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
			Class.forName("com.mysql.cj.jdbc.Driver");		
		
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jayesh", "root", "jayesh@123");
			
			PreparedStatement ps=con.prepareStatement("insert into employee2 values(?,?,?,?,?);");
			
			ps.setInt(1, 2);
			ps.setString(2, "sayli");
			ps.setString(3, "akola");
			ps.setString(4, "f");
			ps.setString(5, "tcs");
			
			int i=ps.executeUpdate();
			
			System.out.println(i+"insert succesfully");
			
			con.close();
					
		} 
	catch (Exception e) 
	{
		System.out.println(e);
	}

	}

}
