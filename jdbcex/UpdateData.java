package com.jdbc.example;


import java.sql.*;



public class UpdateData {

	
	public static void main(String[] args) {
	
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			String DB_URL = "jdbc:mysql://localhost/mani";
			String USER = "root";
			String PASS = "root";
			
			 Connection Con = DriverManager.getConnection(DB_URL, USER, PASS);
			
			String q="update student  set first=?,last=?,age=? where id=?"; 
			
			PreparedStatement  pstmt =Con.prepareStatement(q);
			
		
			 pstmt.setString(1,"XYX");
			 pstmt.setString(2,"ABC");
			 pstmt.setInt(3,40);
			 pstmt.setInt(4,100);
			 pstmt.executeUpdate();
			 
			 System.out.println("updated");
			 Con.close();
			 
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
		
		
		
		
		
	


