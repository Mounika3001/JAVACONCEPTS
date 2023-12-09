package twoDjaggedarray;

import java.util.Scanner;

public class LongArray {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the 1d array length");
	long arr[][]=new long[scan.nextInt()][];
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=new long[scan.nextInt()];
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("Enter the company "+i+" employee "+j+" salary is");
			arr[i][j]=scan.nextLong();
		}
	}
	System.out.println("Array contents are: ");
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	scan.close();
}
}
