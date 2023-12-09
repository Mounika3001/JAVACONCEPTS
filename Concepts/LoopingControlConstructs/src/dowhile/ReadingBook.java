package dowhile;

import java.util.Scanner;

public class ReadingBook {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int pageno=100;
	System.out.println("Number pages in book"+pageno);
	boolean bored=true;
	int i=1;
	do 
	{
		System.out.println("Kodman read page"+i);
		i++;
		System.out.println("Do you want to read say it in true/false");
		bored=scan.nextBoolean();
	}while(bored);
	scan.close();
}
}
