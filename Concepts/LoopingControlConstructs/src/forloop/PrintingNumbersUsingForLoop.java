package forloop;

import java.util.Scanner;

public class PrintingNumbersUsingForLoop {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter how many numbers to be print");
	int n=scan.nextInt();
	for (int i = 0; i <=n; i++) {
		System.out.print(i+" ");
		
	}
	scan.close();
}
}
