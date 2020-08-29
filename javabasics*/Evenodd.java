package Iterationss;

import java.util.Scanner;

public class Evenodd {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number of your choice: ");
		int number;
		
		number  = scanner.nextInt();
		
		if(number % 2 == 0)
		{
			System.out.println(number+" is even number");
		}
		else
		{
			System.out.println(number+" is odd numver");
		}
		

		

	}

}


