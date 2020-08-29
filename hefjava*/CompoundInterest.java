package ASSIGN2;

import java.util.Scanner;

public class CompoundInterest {

	
	public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter the principal:");
				double principal=sc.nextDouble();
				
				System.out.println("Enter the rate:");
				double rate=sc.nextDouble();
				
				
				System.out.println("Enter the time:");
				double time=sc.nextDouble();
				
				
				System.out.println("Enter number of times interst is compounded:");
				int number=sc.nextInt();
				
				double interest=principal*(Math.pow((1+rate/100),(time*number)))-principal;
				
				System.out.println(" principal:"+principal);
				System.out.println(" Interest Rate:"+rate);
				System.out.println(" Time Duration:"+time);
				System.out.println(" Number of Time interest Compouded:"+number);
				System.out.println(" Compoud  Interest:"+interest);
				
				
				
			}
				}


