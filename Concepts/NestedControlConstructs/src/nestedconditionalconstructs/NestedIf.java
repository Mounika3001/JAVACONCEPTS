package nestedconditionalconstructs;

import java.util.Scanner;

public class NestedIf {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number to find it is positive and even or not");
	int n=scan.nextInt();
	if(n>0)
	{
		System.out.println(n+" is positive number");
		if(n%2==0)
		{
			System.out.println(n+" is even number");
		}
	}
	scan.close();
	
}
}
