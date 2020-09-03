package Modifier;

public class EmployeeDemoMain {

	
	public static void main(String[] args) {
		EmployeeDemo object = new EmployeeDemo();
		object.emp_id =+101;
		object.display();

  
		EmployeeDemo object1 = new EmployeeDemo();
		object1.emp_name ="Rakesh";
		object1.display1();
  
		
		//EmployeeDemo object2 = new EmployeeDemo();      private not accesible
	//	object2.emp_salary =+10000;                      
	//		object2.display2();
		
			EmployeeDemo object3 = new EmployeeDemo();	
			object3.emp_dept ="HR";
			object3.display3();


		}
		
		
		


	}


