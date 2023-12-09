package ifcontrolconstruct;

import java.util.Scanner;

public class TechClub {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks ");
		int marks=scan.nextInt();
		//simple if conditional construct
		if(marks>90)
		{
			System.out.println("Welcome to tech club");
		}
		scan.close();
	}

}
