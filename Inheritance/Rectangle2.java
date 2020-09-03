package Inheritance;

import java.util.Scanner;


	public class Rectangle2 extends Square2 {
		
		float length, breadth;
		Scanner sc=new Scanner(System.in);
		 public Rectangle2()
		 {
			 
		 }
		 
		 public void area()
		 {
			 System.out.println("Enter the Value of Rectangle Length : ");
			 length=sc.nextFloat();
			 
			 System.out.println("Enter the Value of Rectangle Breadth : ");
			 breadth=sc.nextFloat();
		
			 float area=length*breadth;
			 System.out.println("The area of Rectangle is : "+area);
		 }
	}

