package Modifier;

public class Private {

	private int number ; 
	
	
	   private Private() 
		{
			number =4000;
		}
		
	private	void display()
		{
			System.out.println("the value is: "+number);
		}


public static void main(String[] args) {
	
	Private1 object = new Private1();
	
	object.number = 4000; 
	object.display();
}

}