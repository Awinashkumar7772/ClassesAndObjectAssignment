package Cdac;

import java.util.Scanner;

public class Book {
String bookId;
String title;
String author;
int price;

public void acceptDetails() {
	Scanner s  = new Scanner(System.in);
	System.out.println("Enter Your BookId");
	this.bookId = s.nextLine();
	System.out.println("Enter Your Book Title");
	this.title = s.nextLine();
	System.out.println("Enter Your Book Author");
	this.author = s.nextLine();
	System.out.println("Enter Your Book Price");
	this.price = s.nextInt();
	
}
public void displayDetails() {
	System.out.println(bookId);
	System.out.println(title);
	System.out.println(author);
	System.out.println(price);
	
}
public static void main(String[] args) {
 Book [] s = new Book[3];
 for(int i =0;i<s.length;i++) {
	 s[i] = new Book();
	 s[i].acceptDetails();
	 s[i].displayDetails();
 }
 
}
}
