package com.jdbc.example;


import java.sql.*;




public class  Insertdata{
	
	
	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			String DB_URL = "jdbc:mysql://localhost/mani";
			String USER = "root";
			String PASS = "root";
			
			 Connection Con = DriverManager.getConnection(DB_URL, USER, PASS);
			
			String q="insert into student(id,first,last,age) values(?,?,?,?)";
			
			PreparedStatement  pstmt =Con.prepareStatement(q);
			
			 pstmt.setInt(1,105);
			 pstmt.setString(2,"XYX");
			 pstmt.setString(3,"ABC");
			 pstmt.setInt(4,40);
			 
			 pstmt.executeUpdate();
			 
			 System.out.println("inserted");
			 Con.close();
			 
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
