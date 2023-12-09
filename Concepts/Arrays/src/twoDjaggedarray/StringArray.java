package twoDjaggedarray;

import java.util.Scanner;

public class StringArray {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter 1d array length: ");
	String arr[][]=new String[scan.nextInt()][];
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("Enter 2d array length");
		arr[i]=new String[scan.nextInt()];
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("Enter school"+i+" student"+j+" name is ");
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
