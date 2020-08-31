package Constructor;

import java.util.Scanner;

public class Circle1 {

	
	public static void main(String[] args) {
		float radius;
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the value of radius:");
		radius=sc.nextFloat();
		
		Circle a=new Circle();
		float area=a.Circlearea(radius);
		System.out.println("The area of circle is:"+area);
		
		float circumference=a.circumference(radius);
		System.out.println("The area circumference is:"+circumference);
	}

}
