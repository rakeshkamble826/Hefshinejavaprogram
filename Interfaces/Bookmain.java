package Interfaces;
import java.util.Scanner;
public class Bookmain {
public static void main(String[] args) {
		
		String bname, author;
		float price;

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Author Book Name is :\n");
		bname=sc.next();
		
		System.out.println("Enter Name of Author is :\n");
		author=sc.next();
		
		System.out.println("Enter Book Price  is :\n");
		price=sc.nextFloat();
		
		Book b=new Book(bname,author,price);
		

		
		System.out.println("The Author Book Name is :"+b.getName());
		
		System.out.println("The Author Name is :"+b.getAuthor());

		System.out.println("The Book Price is :"+b.getPrice());


	}

}
