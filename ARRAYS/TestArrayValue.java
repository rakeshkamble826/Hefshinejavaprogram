//Q.2 Write a program to test if an array contain a Specific Value


package ArrayAssignment;

public class TestArrayValue {

	 public static void main(String[] args) {
	        int[] num = {5, 6, 7, 8, 9};
	        int tofind = 8;
	        boolean found = false;

	        for (int n : num) {
	            if (n == tofind) {
	                found = true;
	                break;
	            }
	        }

	        if(found)
	            System.out.println(tofind + " is found.");
	        else
	            System.out.println(tofind + " is not found.");
	    }
	}



