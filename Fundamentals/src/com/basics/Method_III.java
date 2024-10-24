package com.basics;

import java.util.Scanner;

class Employee{
	int empId;
	String empName;
	char isActive;
	
	public void setDetails(int id,String name,char active) {
		empId = id;
		empName = name;
		isActive = active;
		
	}
	
	public void getDetails() {
	System.out.println("EmployeeId :"+empId+" EmployeeName :"+empName+" isActive :"+isActive);
		
	}
}


public class Method_III {

	public static void main(String[] args) {
		//Scanner : java.util
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee name");
		String name = sc.nextLine();
		
		System.out.println("Is current employee :");
		char active = sc.next().charAt(0);
		System.out.println("Enter the employeeId");
		int id = sc.nextInt();
		
		
        
		Employee e = new Employee();
		e.setDetails(id, name,active);
		e.getDetails();
	}

}
