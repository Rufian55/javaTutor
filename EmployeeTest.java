import java.io.*;
public class EmployeeTest {
	
	public static void main(String args[]){
		// Instantiate two Employee objects.
		Employee empOne = new Employee("Chris Kearns");
		Employee empTwo = new Employee("Jane Smith");
		
		// Invoke Employee class methods.
		empOne.setEmpAge(69);
		empOne.setEmpDesignation("Senior Senior Software Engineer");
		empOne.setEmpSalary(1.99);
		empOne.printEmployee();
		
		empTwo.setEmpAge(21);
		empTwo.setEmpDesignation("Software Programming Genius");
		empTwo.setEmpSalary(69000.01);
		empTwo.printEmployee();
	}
}