package tutor;
import java.io.*;

public class EmployeeTest {
	public static void main(String []args){
		// Create 2 objects using constructor from Employee.java
		Employee empOne = new Employee("Chris Kearns");
		Employee empTwo = new Employee("Jane Smith");
		
		empOne.empAge(19);
		empOne.empDesignation("Ruler of the Galaxy");
		empOne.empSalary(1.99);
		Employee.setFireable(false);
		empOne.printEmployee();
		
		empTwo.empAge(25);
		empTwo.empDesignation("The Alien Queen");
		empTwo.empSalary(375000.00);
		/* Below works, but since accessed from outside Employee
		   class should be like line 13. "Employee.setFireable(true);" */
		empTwo.setFireable(true);
		empTwo.printEmployee();
	}
}
