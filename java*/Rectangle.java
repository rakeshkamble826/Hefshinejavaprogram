package Constructor;

public class Rectangle {

	
	 int length,breadth,area;
	 
	 Rectangle()
	 {
		 length=0;
		 breadth=0;
	}
	 Rectangle(int length,int breadth)
	 {
		 this.length=length;
		 this.breadth=breadth;
		 
	 }
	 Rectangle(int number)
	 {
		 length=number;
		 breadth=number;
	 }
	 
	 void area()
	 {
		 area=length*breadth;
	 }
	 void display()
	 {
		 area();
		 System.out.println("The area of Rectangle is :"+area);
	 }
}
