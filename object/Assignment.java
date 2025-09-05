package Cdac;

import java.util.Scanner;

public class Assignment {
			int rollNo;
			String name;
			String cname;
			String subject;
			int marks;
			
		public void acceptDetails( ) {
			Scanner s = new Scanner(System.in);
			this.rollNo = s.nextInt();
			s.nextLine();
			this.name = s.nextLine();
			this.cname = s.nextLine();
			this.subject = s.nextLine();
			this.marks = s.nextInt();
			
		}
		public void displayDetails() {
			System.out.println(rollNo);
			System.out.println(name);
			System.out.println(cname);
			System.out.println(subject);
			System.out.println(marks);
			
		}
		public void findResult() {
			if(marks>=40) {
				System.out.println("Pass");
			}
			else {
				System.out.println("Fail");
			}
		}
		public  static void main(String []args) {
			Assignment a = new Assignment();
			a.acceptDetails();
			a.displayDetails();
			a.findResult();
		}
  
  }

