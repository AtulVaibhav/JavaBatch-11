package com.basics;


class Car{
	int data =100;
	static int data2 = 200;
	
	public static void getData(Car obj) {
		//Car obj = new Car();
		//System.out.println("Inside getData() :"+obj.hashCode());
		System.out.println(Car.data2);
		System.out.println(obj.data);
		int data3 = 500;
	}
	
   public void getValue() {
		System.out.println(data);
		System.out.println(Car.data2);
	    int data4 = 23;
		
	}
}


public class Method_II {

	public static void main(String[] args) {
		Car obj = new Car();
		System.out.println("Inside main() :"+obj.hashCode());
		Car.getData(obj);
	}

}
