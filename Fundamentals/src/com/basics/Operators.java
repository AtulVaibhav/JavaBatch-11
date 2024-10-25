package com.basics;

public class Operators {
    public static void arithmeticOperator() {
    	int a = 10;
    	int b = 5;
    	System.out.println(a+b);
    	System.out.println(a-b);
    	System.out.println(a*b);
    	System.out.println(a/b);//quotient
    	System.out.println(a%b);//remainder
    }
    public static void relationalOperator() {
    	int a = 10;
    	int b = 5;
    	System.out.println(a>b);
    	System.out.println(a>=b);
    	System.out.println(a<b);
    	System.out.println(a<=b);
    	System.out.println(a==b);
    	System.out.println(a!=b);
    }
    
    public static void logicalOperator() {
    	int a =10;
    	int b = 20;
    	
    	System.out.println((a<b)||(a==b));
    	System.out.println((a>b) && (a!=b));
    	System.out.println(!(a>b));
    }
    
    public static void assignmentOperator() {
    	int a = 9;
    	a += 10; // a = a+10
    }
    
    public static void unaryOperator() {
    	int a = 10;
    	int b = ++a;
    	/*a = a+1
    	 * b = a
    	 * 
    	 */
    	System.out.println(a+" "+b);
    }
    
    public static void ternaryOperator() {
    	int a=10;
    	int b=5;
    	String str = (a>b)?"Hello":"Hi";
    	System.out.println(str);
    }
    
    public static void bitwiseOperator() {
    	int a = 10;
    	int b=7;
    	System.out.println(a|b);
    	System.out.println(a&b);
    	System.out.println(a^b);
    }
    
    public static void shiftOperator() {
    	int a  = 10;
    	System.out.println(a<<2);
    	System.out.println(a>>2);
    }
    
    public static void instanceOfOperator() {
    	String str = "Hello";
    	if(str instanceof String) {
    		System.out.println(str.length());
    	}
    }
    
	public static void main(String[] args) {
		Operators.arithmeticOperator();
        Operators.unaryOperator();
        Operators.ternaryOperator();
        Operators.bitwiseOperator();
        Operators.shiftOperator();
        Operators.instanceOfOperator();
	}

}
