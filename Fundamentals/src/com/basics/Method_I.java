package com.basics;

// void getEmployeeInfo(int);
class EmployeeInfo{
	public void getEmployeeInfo(int num) {
		if(num>3) {
			System.out.println("No info");
			return;
		}
		System.out.println("Hello");
	}
	
	public static void getCompanyName() {
		System.out.println("No company found");
	}
	
	public String getEmployeeName() {
		return "Varun";
		
	}
	public static int getEmployeeCount() {
		return 0;
	}
	
	
}
public class Method_I {
	public static void main(String[] args) {
		EmployeeInfo emp = new EmployeeInfo();
		emp.getEmployeeInfo(23);
		
		EmployeeInfo.getCompanyName();
		
		String name = emp.getEmployeeName();// name = "Varun"
		System.out.println(name);
		
		System.out.println(emp.getEmployeeName());
		
		
		
	}
}
