package Abstract;


import Arithmatic.Division;
import Arithmatic.Multiplication;
import Arithmatic.Subtraction;


public class ArithmaticMain {
	public static void main(String[] args) {

		Subtraction s=new Subtraction();
		s.addition();
		s.substraction();
		
		Multiplication m=new Multiplication();
		m.multiply();
		
		Division d=new Division();
		d.division();
		
		
	}

}
