package infiniteloops;

import java.util.Scanner;

public class forloop {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter any thing to print infinite times");
	String word=scan.nextLine();
	scan.close();
	
	for(;;)
	{
		System.out.println(word);
	}
}
}
