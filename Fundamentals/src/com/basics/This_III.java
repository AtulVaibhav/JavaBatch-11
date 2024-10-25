package com.basics;

class Mobile{
	public void m1() {
		System.out.println("m1() called");
		this.m2();
	}
	
	public void m2() {
		System.out.println("m2() called");
	}
}

public class This_III {

	public static void main(String[] args) {
		new Mobile().m1();
	}

}
