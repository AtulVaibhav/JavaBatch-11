package com.basics;

class Dimension{
	static int count = 0;
	Dimension(){
		count++;
	}
	public static int getCount() {
		return count;
	}
}


public class Constructor_II {

	public static void main(String[] args) {
		Dimension d = new Dimension();
		Dimension d2 = new Dimension();
		Dimension d3 = new Dimension();
		Dimension d4 = new Dimension();
		System.out.println(Dimension.getCount());
	}

}
