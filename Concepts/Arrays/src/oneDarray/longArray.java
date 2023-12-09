package oneDarray;

import java.util.Scanner;

public class longArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array length");
	long arr[]=new long[scan.nextInt()];
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextLong();
	}
	System.out.println("Array contents are:");
	for (long l : arr) {
		System.out.print(l+" ");
	}
	scan.close();
}
}
