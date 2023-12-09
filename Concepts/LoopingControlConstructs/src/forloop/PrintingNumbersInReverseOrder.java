package forloop;

import java.util.Scanner;

public class PrintingNumbersInReverseOrder {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter a number");
	int n=scan.nextInt();
	for(int i=n;i>=0;i--)
	{
		System.out.print(i+" ");
	}
	scan.close();
}
}
