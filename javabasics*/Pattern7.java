package ASSIGNMEN3;

import java.util.Scanner;

public class Pattern7 {
	

		public static void rightTriangle(int n)
		{
			int i,j;
			 
	     for(i=0;i<n;i++)
	     {
	       System.out.println(" ");
	     }
	     for(j=0;j<=i;j++)
	     {
	    	 System.out.println("* ");
	     }
	     System.out.println();
		
	}





      public static void main(String args[]){
    	  int n=5;
    	  rightTriangle(n);
      }
      }