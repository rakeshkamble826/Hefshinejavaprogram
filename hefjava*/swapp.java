package ASSIGN2;

public class swapp {

	
	public static void main(String[] args) {
		int num1 =1000;
		int num2 = 4000;
		
		System.out.println("before swapping: ");
		System.out.println("num1 is : "+num1);
		System.out.println("num2 is : "+num2);
		
		int temp = num1;
		    num1 = num2;
		    num2 = temp;
		    
		    System.out.println("after swapping: ");
		    System.out.println("num1 is : "+num1);
           System.out.println("num2 is : "+num2);
	}  
}


    