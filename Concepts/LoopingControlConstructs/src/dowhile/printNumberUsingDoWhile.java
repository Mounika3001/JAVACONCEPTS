package dowhile;

import java.util.Scanner;

public class printNumberUsingDoWhile {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter a number");
	int n=scan.nextInt();
	int i=0;
	do
	{
		System.out.print(i+" ");
		i++;
	}while(i<=n);
	scan.close();
}
}
