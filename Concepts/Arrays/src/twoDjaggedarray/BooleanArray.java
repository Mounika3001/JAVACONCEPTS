package twoDjaggedarray;

import java.util.Scanner;

public class BooleanArray {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the 1d array length: ");
	boolean arr[][]=new boolean[scan.nextInt()][];
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("Enter 2d array length");
		arr[i]=new boolean[scan.nextInt()];
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("Enter the company "+i+" employee "+j+" is married");
		  arr[i][j]=scan.nextBoolean();
		}
	}
	System.out.println("Array contents are ");
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
