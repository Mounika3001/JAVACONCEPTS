package elseifcontrolconstruct;

import java.util.Scanner;

public class Subtraction {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers for subtraction");
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a>b)
		{
			System.out.println("Subtraction result"+(b-a));
		}
		else
		{
			System.out.println("Subtraction result"+(a-b));
		}
		scan.close();
	}

}
