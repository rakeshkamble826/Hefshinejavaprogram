
package ASSIGNMENT;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		
		float length,width,area,perimeter;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter length of rectanle:");
		length=in.nextFloat();
		
		System.out.println("Enter width of rectanle:");
		width=in.nextFloat();
		
		area=length*width;
		perimeter=2*(length+width);
		
		System.out.println("Area of rectangle is:"+area);
		System.out.println("Perimeter of rectangle is:"+perimeter);
	}

}
