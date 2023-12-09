package oneDarray;

import java.util.Scanner;

public class StringArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array length");
	String str[]=new String[scan.nextInt()];
	System.out.println("Enter array number of elements to store in array");
	for(int i=0;i<=str.length-1;i++)
	{
		System.out.println("Enter name "+i);
		str[i]=scan.next();
		
	}
	System.out.println("Array contents are");
	for (String string : str) {
		System.out.print(string+" ");
	}
	scan.close();
}
}
