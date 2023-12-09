package twoDarray;

import java.util.Scanner;

public class DoubleArray {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the array length ");
	double arr[][]=new double[scan.nextInt()][scan.nextInt()];
	System.out.println("Enter the length of elements "+arr.length+" to store in the array");
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("Enter the array "+i+" of value is "+j+"   ");
			arr[i][j]=scan.nextDouble();
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
