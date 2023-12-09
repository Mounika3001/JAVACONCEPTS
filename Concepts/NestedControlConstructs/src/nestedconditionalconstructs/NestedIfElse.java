package nestedconditionalconstructs;

import java.util.Scanner;

public class NestedIfElse {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number to find it is positive or negative and even or odd number");
	int n=scan.nextInt();
	if(n>0)
	{
		System.out.println(n+" is positive number");
		if(n%2==0)
		{
			System.out.println(n+" is even number");
			
		}else
		{
			System.out.println(n+" is odd number");
		}
	}
	else
	{
		System.out.println(n+" is negative number");
		if(n%2==0)
		{
			System.out.println(n+" is even number");
			
		}else
		{
			System.out.println(n+" is odd number");
		}
		
	}
	scan.close();
}
}
