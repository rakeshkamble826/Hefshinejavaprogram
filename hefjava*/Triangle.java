package ASSIGNMENT;

import java.util.Scanner;

public class Triangle {

	
	public static void main(String[] args) {
		float side,area;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter side of Triangle:");
		side=in.nextFloat();
		
		area= (float) ((Math.sqrt(3)/4)*(side*side));
		
		System.out.println("Area of Triangle:"+area);
		
	}

}
