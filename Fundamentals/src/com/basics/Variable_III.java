package com.basics;

class Box{
	public void printDimension() {
		int length=100;
		int breadth = 200;
		System.out.println(length* breadth);
		
	}
	
}

public class Variable_III {

	public static void main(String[] args) {
		Box b = new Box();
		b.printDimension();
	}

}
