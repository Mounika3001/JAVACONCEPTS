package whileloop;

import java.util.Scanner;

public class PrintingNumbersInReverseOrderUSingWhile {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter a number");
	int n=scan.nextInt();
	int i=n;
	while(i>=0)
	{
		System.out.print(i+" ");
		i--;
	}
	scan.close();
}

}
