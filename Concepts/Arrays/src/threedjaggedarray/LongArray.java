package threedjaggedarray;

import java.util.Scanner;

public class LongArray {
public static void main(String[] args) {
	System.out.println("Enter the 1d array length");
	Scanner scan = new Scanner(System.in);
	long arr[][][]=new long[scan.nextInt()][][];
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("Enter 2d array length ");
		arr[i]=new long[scan.nextInt()][];
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("Enter 3d array length");
			arr[i][j]=new long[scan.nextInt()];
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
				System.out.println("Enter company "+i+" employee "+j+" id "+k+" salary is");
				arr[i][j][k]=scan.nextLong();
			}
		}
	}
	System.out.println("Array contents are: ");
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
				System.out.print(arr[i][j][k]+" ");
			}
			System.out.println();
		}
		System.out.println("=====================");
	}
	scan.close();
}
}
