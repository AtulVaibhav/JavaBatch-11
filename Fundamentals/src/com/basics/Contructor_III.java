package com.basics;


class StudentInfo{
	int studentId;
	String studentName ;
	
	StudentInfo(int id,String name){
		studentId = id;
		studentName = name;
	}
	@Override
	public String toString() {
		return "StudentInfo [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	
}


public class Contructor_III {

	public static void main(String[] args) {
		StudentInfo s1 = new StudentInfo(101,"Harsh");
		StudentInfo s2 = new StudentInfo(102,"Arya");
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
