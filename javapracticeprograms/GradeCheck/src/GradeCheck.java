import java.util.Scanner;

public class GradeCheck {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the grade ");
	int grade=scan.nextInt();
	gradeCheck(grade);
	scan.close();
}
public static void gradeCheck(int grade)
{
	if(grade>=50)
	{
		System.out.println("Pass");
	}else
	{
		System.out.println("Fail");
	}
}
}
