package arrays.level1;

import java.util.Scanner;

public class Arrayp1 {
public static void main(String[] args) {
	System.out.println("Enter the array length");
	Scanner scan = new Scanner(System.in);
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("Enter the array value "+i);
		arr[i]=scan.nextInt();
	}
	System.out.println("array contents are: ");
	for (int i : arr) {
		System.out.print(arr[i]+" || ");
	}
	scan.close();
}
}
