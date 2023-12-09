package infiniteloops;

import java.util.Scanner;

public class dowhile {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter any thing to print infinite times");
	String word=scan.nextLine();
	scan.close();
	do
	{
		System.out.println(word);
	}while(true);
}
}
