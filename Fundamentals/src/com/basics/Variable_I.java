package com.basics;

class Student{
	int studentId = 101;//instance variable

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + "]";
	}
	
	
}


public class Variable_I {

	public static void main(String[] args) {
		Student s = new Student();// creating an object of type Student
		System.out.println(s);
		Student s2 = new Student();
		// Accessing instance variable
		System.out.println(s.studentId);
		System.out.println(s2.studentId);
		
		System.out.println("______________________________");
		System.out.println("After modification");
		s.studentId = 500;
		
		System.out.println(s.studentId);
		System.out.println(s2.studentId);
		

	}

}
