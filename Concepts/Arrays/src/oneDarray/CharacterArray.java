package oneDarray;

import java.util.Scanner;

public class CharacterArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array length ");
	char ch[]=new char[scan.nextInt()];
	System.out.println("Enter array of "+ch.length+" elements to store in array");
	for(int i=0;i<=ch.length-1;i++)
	{
		System.out.println("Enter character value "+i);
		ch[i]=scan.next().charAt(0);
	}
	System.out.println("Array Contents are: ");
	for (char c : ch) {
		System.out.print(c+" ");
	}
	scan.close();
}
}
