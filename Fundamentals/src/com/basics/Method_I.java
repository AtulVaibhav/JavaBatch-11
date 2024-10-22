package com.basics;


class EmployeeInfo{
	public void getEmployeeInfo() {
		System.out.println("No details available");
	}
	
	public static void getCompanyName() {
		System.out.println("No company found");
	}
	
	public String getEmployeeName() {
		return "Varun";
	}
	
	
}
public class Method_I {
	public static void main(String[] args) {
		EmployeeInfo emp = new EmployeeInfo();
		emp.getEmployeeInfo();
		
		EmployeeInfo.getCompanyName();
		
		String name = emp.getEmployeeName();// name = "Varun"
		System.out.println(name);
		
		System.out.println(emp.getEmployeeName());
		
		
		
	}
}
