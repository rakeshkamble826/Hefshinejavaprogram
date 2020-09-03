package Inheritance;
import java.util.Scanner;
public class Square2 {
	float side;
	Scanner sc=new Scanner(System.in);
	
	public Square2()
	{
		
	}
	
	public void area()
	{
		
		System.out.println("Enter the value of Square side : ");
		side=sc.nextFloat();
		float area=2*side+2*side;
		System.out.println("The Area of Square is : "+area);
	}
}

