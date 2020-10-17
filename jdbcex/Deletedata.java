package com.jdbc.example;

import java.sql.*;

public class Deletedata {

	
	public static void main(String[] args) {
	
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			String DB_URL = "jdbc:mysql://localhost/mani";
			String USER = "root";
			String PASS = "root";
			
			 Connection Con = DriverManager.getConnection(DB_URL, USER, PASS);
			
			String q="delete from student where id=?"; 
			
			PreparedStatement  pstmt =Con.prepareStatement(q);
			
		
			
			 pstmt.setInt(1,104);
			 pstmt.executeUpdate();
			 
			 System.out.println("deleted");
			 Con.close();
			 
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	}


