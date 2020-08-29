
package Iterationss;



	import java.util.Scanner;

	public class Assign3 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a number upto which you want to display:");
			
			int usernumber=sc.nextInt();
			
			int firstnumber,secondnumber,thirdnumber;
			firstnumber=0; secondnumber=1;
			
			System.out.println(firstnumber+"   "+secondnumber);
			
			for (int i=0; i<usernumber-2;i++);
			
			{
			thirdnumber=firstnumber+secondnumber;
			
			firstnumber=secondnumber;
			secondnumber=thirdnumber;
			
			System.out.println("   "+thirdnumber);
	}
	}
	}

/*  second method
public class Fibo23 {

	
	public static void main(String[] args) {
		int i=1, n=10, t1 =0, t2 =1;
		 System.out.println("First"+n+"terms:");
		 
		 
		 while(i<=n)
		 {
			 System.out.println(t1 + " + ");
			 		
					 int sum=t1+t2;
			           t1=t2;
			           t2=sum;
			           i++;
			           
		 }

	}
	}
	*/