package Cdac;

import java.util.Scanner;

public class Employee {
 int empId;
 String name;
 String designation;
  double salary ;
  public void acceptDetails() {
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter Your Employee ID");
	  this.empId = s.nextInt();
	  s.nextLine();
	  System.out.println("Enter Your Name");
	  this.name = s.nextLine();
	  System.out.println("What is Your Designation");
	  this.designation = s.nextLine();
	  this.salary = s.nextDouble();
	  
  }
  public void displayDetails() {
	  System.out.println(empId);
	  System.out.println(name);
	  System.out.println(designation);
	  System.out.println(salary);
  }
  public void findBonus() {
	double bonus = salary*10/100.0;
	System.out.println(bonus);
  }
  public static void main(String[] args) {
	Employee e = new Employee();
	e.acceptDetails();
	e.displayDetails();
	e.findBonus();
}
}
