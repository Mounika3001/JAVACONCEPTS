package twoDjaggedarray;

import java.util.Scanner;

public class DoubleArray {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the 1d array length");
	double arr[][]=new double[scan.nextInt()][];
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("Enter the 2d array length");
		arr[i]=new double[scan.nextInt()];
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("Enter the school"+i+" student "+j+" running speed");
			arr[i][j]=scan.nextDouble();
		}
	}
	System.out.println("Array contents: ");
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
