package com.basics;


//Object : default parent class
public class TypeCasting {
    static Object obj;
	public static void main(String[] args) {
		// data_type varName = value;
		 
		//Implicit typeCasting:
		byte a = 10;
		short b = a;
		System.out.println(a+" "+b);
		
		
		// Explicit typeCasting:
		int x = 234;
		byte y = (byte)x;
		System.out.println(x+" "+y);
		
		// ClassName varName = new ClassName(); : creating an object
		TypeCasting typeCasting = new TypeCasting();
		obj = typeCasting;

	}

}
