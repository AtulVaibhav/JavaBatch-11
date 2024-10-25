package com.basics;

class Book{
	int bookId;
	String bookName;
	
	public Book(int bookId, String bookName) {
		
		this.bookId = bookId;
		this.bookName = bookName;
	}
	
	
	public void printDetails() {
		System.out.println("BookId :"+this.bookId);
		System.out.println("BookName :"+this.bookName);
	}


}


public class This_IV {

	public static void main(String[] args) {
       Book b = new Book(101,"Java Reference");
       b.printDetails();
	}

}
