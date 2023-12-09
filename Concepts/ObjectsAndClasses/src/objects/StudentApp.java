package objects;

import java.util.Scanner;

public class StudentApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Student s=new Student();
	System.out.println("Enter the student id");
	s.id=scan.nextInt();
	System.out.println("enter the student name");
	s.name=scan.next();
	System.out.println("Enter the age");
	s.age=scan.nextInt();
	s.eat();
	s.sleep();
	s.study();
	scan.close();
	
	
			
}
}
