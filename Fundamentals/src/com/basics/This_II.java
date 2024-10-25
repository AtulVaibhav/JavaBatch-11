package com.basics;

// case 1: when there is a naming confliction between instance variable
// and local variable
class School{
	int data = 100;
	
	public void printData() {
//		int data = 200;
		System.out.println(this.data);//200
//		System.out.println(this.hashCode());
	}
}

public class This_II {

	public static void main(String[] args) {
		School obj1 = new School();
		School obj2 = new School();
		obj1.printData();
		System.out.println(obj1.hashCode());

	}

}
