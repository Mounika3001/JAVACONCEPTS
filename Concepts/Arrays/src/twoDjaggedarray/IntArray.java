package twoDjaggedarray;

import java.util.Scanner;

public class IntArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 1d array length");
	
	int arr[][]=new int[scan.nextInt()][];
	
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("Enter the 2D array length: ");
		arr[i]=new int[scan.nextInt()];
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("Enter the school "+i+ " class "+j+" number of students ");
			arr[i][j]=scan.nextInt();
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
