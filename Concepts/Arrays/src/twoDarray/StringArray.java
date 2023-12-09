package twoDarray;

import java.util.Scanner;

public class StringArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array length are: ");
	String arr[][]=new String[scan.nextInt()][scan.nextInt()];
	System.out.println("Enter the "+arr.length+" number of elements to store in the array");
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("Enter the array "+i+" values "+j+"  ");
			arr[i][j]=scan.next();
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
