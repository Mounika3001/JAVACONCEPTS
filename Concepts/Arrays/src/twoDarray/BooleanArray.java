package twoDarray;

import java.util.Scanner;

public class BooleanArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array length: ");
	boolean arr[][]=new boolean[scan.nextInt()][scan.nextInt()];
	System.out.println("Enter the"+arr.length+" number of elements to store in the array ");
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("Enter the array "+i+" value is "+j+"  ");
			arr[i][j]=scan.nextBoolean();
		}
	}
	System.out.println("Enter the array contents are: ");
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
