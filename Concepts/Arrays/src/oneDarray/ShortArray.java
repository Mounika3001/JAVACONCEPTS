package oneDarray;

import java.util.Scanner;

public class ShortArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array length");
	short s[]=new short[scan.nextInt()];
	System.out.println("Enter the array of "+s.length+" elements to store in array");
	for(int i=0;i<=s.length-1;i++)
	{
		System.out.println("Enter short values "+i);
		s[i]=scan.nextShort();
	}
	System.out.println("Array contents are: ");
	for (short t : s) {
		System.out.print(t+"");
	}
	scan.close();
}
}
