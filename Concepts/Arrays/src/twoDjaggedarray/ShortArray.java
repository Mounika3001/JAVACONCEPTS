package twoDjaggedarray;

import java.util.Scanner;

public class ShortArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the 1d array: ");
	short arr[][]=new short[scan.nextInt()][];
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("Enter 2d array length");
		arr[i]=new short[scan.nextInt()];
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("Enter the team"+i+" player "+j+" runs ");
			arr[i][j]=scan.nextShort();
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
