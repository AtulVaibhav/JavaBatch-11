package com.basics;

class Code{

	@Override
	public String toString() {
		return "custom object created";
	}
	
	
}
public class Test1 {
  public static void main(String[] args) {
	// new ClassName();
	Code ob =   new Code();
	System.out.println(ob);
//	Code ob1 =   new Code();
//	System.out.println(ob1);
//	
//	Code obj2 = ob1;
//	if(ob1==ob) {
//		System.out.println("Points to same location");
//	}else {
//		System.out.println("Points to different locations");
//	}
//	
//	//hashCode()
//	System.out.println(ob.hashCode());
	
	//toString: string representation
	System.out.println(ob.toString());
	
	
	
	
}
}
