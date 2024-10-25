package com.basics;


// constructor chaining: calling one constructor from another 
//constructor
class Notebook{
	Notebook(){
		
		System.out.println("default constructor");
	}
	
	Notebook(int a){
		this("anuj");
		System.out.println("parameterized constructor");
	}
	Notebook(String b){
		this();
		System.out.println("parameterized constructor with string value");
	}
}
public class This_V {

	public static void main(String[] args) {
		Notebook obj = new Notebook(10);

	}

}
