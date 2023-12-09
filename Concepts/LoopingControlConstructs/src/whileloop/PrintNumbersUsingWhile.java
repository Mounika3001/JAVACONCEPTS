package whileloop;

import java.util.Scanner;

public class PrintNumbersUsingWhile {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int n=scan.nextInt();
	int i=0;
	while(i<=n)
	{
		System.out.print(i+" ");
		i++;
	}
	scan.close();
}
}
