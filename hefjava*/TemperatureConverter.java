package ASSIGNMENT;

import java.util.Scanner;

public class TemperatureConverter {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter temperature in celsius:");
		float C=in.nextFloat();
		
		float F=C*(9f/5)+32;
		
		System.out.println( C  +  "degree Celsius is equal to" + F + " degree Fahrenheit");
		
	}

}
