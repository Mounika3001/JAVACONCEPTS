import java.util.Scanner;

public class AverageMarksApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter sem 1 marks");
	int sem1=scan.nextInt();
	System.out.println("Enter sem 2 marks");
	int sem2=scan.nextInt();
	System.out.println("Enter sem 3 marks");
	int sem3=scan.nextInt();
	System.out.println("Enter sem 4 marks");
	int sem4=scan.nextInt();
	System.out.println("Enter sem 5 marks");
	int sem5=scan.nextInt();
	System.out.println("Enter sem 6 marks");
	int sem6=scan.nextInt();
	System.out.println("Enter sem 7 marks");
	int sem7=scan.nextInt();
	System.out.println("Enter sem 8 marks");
	int sem8=scan.nextInt();
	System.out.println(AverageMarks.calculateAverage(sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8));
	
}
}
