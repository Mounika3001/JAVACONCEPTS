package objects;

import java.util.Scanner;

public class TeacherApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Teacher t=new Teacher();
	System.out.println("Enter id of the teacher");
	t.id=scan.nextInt();
	System.out.println("Enter teacher name");
	t.name=scan.next();
	System.out.println("Enter teaching subject name");
	t.subject=scan.next();
	System.out.println("Enter the salary");
	t.salary=scan.nextDouble();
	System.out.println("==================================");
	t.teach();
	System.out.println("==================================");
	t.giveAssignment();
	System.out.println("==================================");
	t.markAttendence();
	scan.close();
}
}
