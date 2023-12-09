package dowhile;

import java.util.Scanner;

public class PrintingNumbersInReverseOrderUsingDoWhile {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int n=scan.nextInt();
	int i=n;
	do
	{
		System.out.print(i+" ");
		i--;
		
	}while(i>=0);
	scan.close();
}
}
