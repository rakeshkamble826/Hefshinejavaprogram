package Constructor;

import java.util.Scanner;

public class Bank1 {

	
	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
         int amount=0;
         
         System.out.println("Add amount in account?");
         char ans=sc.next().charAt(0);
         
         if(ans=='y')
         {
        	  System.out.println("Enter amount to be added:");
        	  amount=sc.nextInt();
        	  Bank bank1=new Bank(amount);
        	  bank1.display();
         }
         else
         {
        	 Bank bank=new Bank();
        	 bank.display();
        	 
        	 
         }
	}

}
