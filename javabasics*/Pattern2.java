package ASSIGNMEN3;

import java.util.Scanner;

public class Pattern2 {

	
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter number  ");
		 
		 int n=sc.nextInt();
	
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=i;j>=1;j--)
			 {
				 System.out.println(j+"   "  );
			 }
		 }
	}

}
