package com.basics;

import java.util.Scanner;

public class EmployeeData {
    int empId;
    String empName;
    String empDept;
    static String companyName = "ABC Pvt Ltd.";
    
    EmployeeData(int id,String name,String dept){
    	empId = id;
    	empName = name;
    	empDept = dept;
    }
    
    
	@Override
	public String toString() {
		return "EmployeeData [empId=" + empId + ", empName=" + empName + 
				", empDept=" + empDept + " companyName="+companyName +"]";
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employeeId");
		int empId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the employeeName:");
		String name = sc.nextLine();
		System.out.println("Enter the deptName:");
		String dept = sc.nextLine();
		EmployeeData d1 = new EmployeeData(empId,name,dept);
		System.out.println(d1);

	}

}
