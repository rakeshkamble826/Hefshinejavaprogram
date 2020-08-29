package ASSIGNMENT;

import java.util.Scanner;

public class SimpleInterest {

	
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the principal:");
		double principal=sc.nextDouble();
		
		System.out.println("Enter the rate:");
		double rate=sc.nextDouble();
		rate=rate/100;
		
		System.out.println("Enter the time:");
		double time=sc.nextDouble();
		
		double interest=(principal*time*rate)/100;
		
		System.out.println(" principal:"+principal);
		System.out.println(" Interest Rate:"+rate);
		System.out.println(" Time Duration:"+time);
		System.out.println(" Simple Interest:"+interest);
		

	}

}
