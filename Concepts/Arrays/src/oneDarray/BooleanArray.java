package oneDarray;

import java.util.Scanner;

public class BooleanArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array length");
	boolean arr[]=new boolean[scan.nextInt()];
	System.out.println("Enter the array elements of length "+arr.length+" to store in array");
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextBoolean();
	}
	System.out.println("Array contents are: ");
	for (boolean b : arr) {
		System.out.print(b+" ");
	}
	scan.close();
}
}
