package ASSIGNMENT;

public class Totalmarks {


	public static void main(String[] args) {
		float Math=90f;
		float History=75f;
		float English=85f;
		float Marathi=87f;
		float Hindi=92f;
		float Environment=89;
		
		float result=Math+History+English+Marathi+Hindi+Environment;
		
		float avg=(Math+History+English+Marathi)/6;
		
		System.out.println("The value of Math is:"+Math);
		System.out.println("The value of History is:"+History);
		System.out.println("The value of English is:"+English);
		System.out.println("The value of Marathi is:"+Marathi);
		System.out.println("The value of English is:"+Hindi);
		System.out.println("The value of Marathi is:"+Environment);
		
		
		System.out.println("The total marks is:"+result);
		System.out.println("The Average marks is:"+avg);
	}



	}


