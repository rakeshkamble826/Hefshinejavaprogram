package Modifier;

public class EmployeeDemo {

	protected int emp_id;
	
	
	public 	String emp_name;
	
	private int emp_salary;
	
	String emp_dept;
	
	
protected void display()
{
	System.out.println(emp_id=+101);
	}
	
public void display1()
{
	System.out.println(emp_name="Rakesh");
	}

private	void display2() 
{
	System.out.println(emp_salary=+10000);
	
}
  void display3()
{
	System.out.println(emp_dept="HR");
	
	}

  public static void main(String[] args) {
		
		
		EmployeeDemo object = new EmployeeDemo();
		object.emp_id =+101;
		object.display();

  
		EmployeeDemo object1 = new EmployeeDemo();
		object1.emp_name ="Rakesh";
		object1.display1();
  
		
		EmployeeDemo object2 = new EmployeeDemo();
		object2.emp_salary =+10000;
			object2.display2();
		
			EmployeeDemo object3 = new EmployeeDemo();	
			object3.emp_dept ="HR";
			object3.display3();


		}
		
		
		
}
