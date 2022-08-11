package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Delect {
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jayesh", "root" ,"jayesh@123");
			
			PreparedStatement ps=con.prepareStatement("delete from employee2 where ename=?;");
			
			ps.setString(1, "sachin");
			
			int i=ps.executeUpdate();
			
			System.out.println(i+"delect done");
			con.close();
			
	
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
