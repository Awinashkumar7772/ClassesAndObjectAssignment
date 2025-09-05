package Cdac;

import java.util.Scanner;

public class Assignment2 {
  int rollNo;
  String name;
  String id;
  int marks;
  public void acceptDetails() {
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter Your Roll Number");
	  this.rollNo = s.nextInt();
	  s.nextLine();
	  System.out.println("Enter Your Name");
	  this.name = s.nextLine();
	  System.out.println("Enter Your Id");
	  this.id = s.nextLine();
	  System.out.println("Enter Your Marks");
	  this.marks = s.nextInt();
  }
  public void displayDetails() {
	  System.out.println(rollNo);
	  System.out.println(name);
	  System.out.println(id);
  }
  public void findresult() {
	  if(marks>=90) {
		  System.out.println("A");
	  }
	  else if(marks>=80 && marks<90) {
		  System.out.println("B");
	  }
	  else if(marks>=70 && marks<80) {
		  System.out.println("C");
	  }
	  else {
		  System.out.println("D");
	  }
  }
  public static void main(String[] args) {
	Assignment2 []a = new Assignment2[5];
	for(int i = 0;i<a.length;i++) {
		a[i] = new Assignment2();
		a[i].acceptDetails();
	}
	for(int i = 0;i<a.length;i++) {
		a[i].displayDetails();
		a[i].findresult();
	}
	
	
}
}
