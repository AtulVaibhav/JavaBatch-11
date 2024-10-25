package com.basics;

class Machine{
	Machine(){
	   System.out.println("current value of this--->"+this.hashCode());	
	}
}

public class This_I {
   public static void main(String[] args) {
	Machine obj = new Machine();
	System.out.println("current value of obj---->"+obj.hashCode());
	//System.out.println("current value of this--->"+this.hashCode());	
	
	Machine obj2 = new Machine();
	System.out.println("current value of obj2---->"+obj2.hashCode());
}
}
