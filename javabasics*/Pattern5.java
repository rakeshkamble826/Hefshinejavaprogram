package ASSIGNMEN3;

import java.util.Scanner;

public class Pattern5 {

	
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter number  ");
		 int num=sc.nextInt();
			
		 
		for(int i=1;i<=num;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 if (j%2==1){
				 System.out.print("1"  );
			 }else{
				 System.out.print("0"  );
			 }
		 }
			 System.out.println(); 
	}

}
	}

