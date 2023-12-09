package elseifcontrolconstruct;

import java.util.Scanner;

public class EvenorOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find it is even or odd");
		int num=scan.nextInt();
		if(num%2==0)
		{
			System.out.println(num+ " is even number");
		}
		else
		{
			
				System.out.println(num+ " is odd number");
			
		}
		scan.close();
	}

}
