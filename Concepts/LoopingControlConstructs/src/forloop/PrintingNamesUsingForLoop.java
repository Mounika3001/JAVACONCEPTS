package forloop;

import java.util.Scanner;

public class PrintingNamesUsingForLoop {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter any word to print n number of times");
	String word=scan.nextLine();
	System.out.println("Enter how many times in need to be printed");
	int n=scan.nextInt();
	for(int i=1;i<=n;i++)
	{
		System.out.println(word);
	}
	scan.close();
}
}
