package com.jdbc.example;



import java.sql.*;


public class JDBC1 {

	
	 static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
     static final String url="jdbc:mysql://localhost/mani";
	
	
	
	
	
     //JDBC DRIVER NAME AND DATABASE URL
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
	 System.out.println("Connecting to database...");
					conn=DriverManager.getConnection(url,"root","root");
				
				stmt=conn.createStatement();
				
				String sql="select * from student";
				ResultSet rs= stmt.executeQuery(sql);
				
				while(rs.next()){
					int roll=rs.getInt("id");
					String name=rs.getString("Name");
					
				
				
				System.out.println(roll+" "+name);
				
				}
				
		rs.close();
		stmt.close();
		conn.close();
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
		} finally{
			
				try {
					if(stmt!=null)
					stmt.close();
				} catch (SQLException se2) {
					// TODO Auto-generated catch block
					
				}try{
					if(conn!=null)
						conn.close();
				
			
		}catch(SQLException se){
			se.printStackTrace();
			
		}

	}              System.out.println("Goodbye!");
		}
	
	
	
	
	
		
	}


