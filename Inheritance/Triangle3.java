package Inheritance;


	public class Triangle3 extends Rectangle2{
		
		float side1,side2,side3;
		
		public Triangle3()
		{
			
		
		}
		public void area()
		{
			System.out.println("Enter the value Side first of Traingle");
			side1=sc.nextFloat();
			
			System.out.println("Enter the value Side Second of Traingle");
			side2=sc.nextFloat();
			
			System.out.println("Enter the value Side Third of Traingle");
			side3=sc.nextFloat();
			
			float area= side1*side2*side3;
			
			System.out.println("The Area of Traingle is : "+area);
			
		}
	}


