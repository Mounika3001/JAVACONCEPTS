package infiniteloops;

import java.util.Scanner;

public class whileloop {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter any thing to print infinite times");
	String word=scan.nextLine();
	scan.close();
	while(true)
	{
		System.out.println(word);
	}
}
}
