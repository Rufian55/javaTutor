package tutor;
import java.io.*;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	
	// Constructor for Employee class.
	public Employee(String name){
		this.name = name;
	}
	
	// Assign age of Employee to int age.
	public void empAge(int empAge){
		age = empAge;
	}
	
	// Assign Employee Designation to designation.
	public void empDesignation(String empDesig){
		designation = empDesig;
	}
	
	// Assign Employee salary to salary.
	public void empSalary(double empSal){
		this.salary = empSal;
	}
	
	// Print the employee's details.
	public void printEmployee(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: $" + salary);
	}
}
