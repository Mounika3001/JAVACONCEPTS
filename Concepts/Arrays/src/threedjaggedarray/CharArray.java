package threedjaggedarray;

import java.util.Scanner;

public class CharArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the 1d array ");
	char arr[][][]=new char[scan.nextInt()][][];
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("Enter the 2d array length");
		arr[i]=new char[scan.nextInt()][];
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("Enter the 3d array length");
			arr[i][j]=new char[scan.nextInt()];
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
				System.out.println("Enter the school"+i+" class "+j+" student "+k+" grade is ");
				arr[i][j][k]=scan.next().charAt(0);
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
		System.out.println("===============================");
	}
	scan.close();
}
}
