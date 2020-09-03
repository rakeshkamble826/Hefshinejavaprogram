package Inheritance;
import java.util.Scanner;
public class Worker {
	
	String sname, saddress, sphoneno;

	int sage,ssalary;

	Scanner ob=new Scanner(System.in);
	
	
	void displaysalary()
	{
		System.out.println("Enter Worker Name : ");
		sname=ob.next();
		System.out.println("Enter Worker Age : ");
		sage=ob.nextInt();
		
		System.out.println("Enter  Worker Phone Number : ");
		sphoneno=ob.next();
		System.out.println("Enter  Worker Address : ");
		saddress=ob.next();
		System.out.println("Enter  Worker Salary : ");
		ssalary=ob.nextInt();
		
	}
}
