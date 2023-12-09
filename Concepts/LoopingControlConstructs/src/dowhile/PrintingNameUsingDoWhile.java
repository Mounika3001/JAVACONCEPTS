package dowhile;

import java.util.Scanner;

public class PrintingNameUsingDoWhile {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter any word to print n number of times");
	String word=scan.nextLine();
	System.out.println("Enter how many times in need to be printed");
	int n=scan.nextInt();
	int i=1;
	while(i<=n)
	{
		System.out.println(word);
		i++;
	}
	scan.close();
}
}
