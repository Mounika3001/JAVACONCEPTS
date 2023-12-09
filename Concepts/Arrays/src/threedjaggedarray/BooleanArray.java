package threedjaggedarray;

import java.util.Scanner;

public class BooleanArray {
public static void main(String[] args) {
	System.out.println("Enter the 1d array length");
	Scanner scan = new Scanner(System.in);
	boolean arr[][][]=new boolean[scan.nextInt()][][];
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("Enter the 2d array length ");
		arr[i]=new boolean[scan.nextInt()][];
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("Enter the 3d array length ");
			arr[i][j]=new boolean[scan.nextInt()];
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
				System.out.println("Enter the college "+i+" class "+j+" student "+k+" is passed ");
				arr[i][j][k]=scan.nextBoolean();
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
		System.out.println("==============================");
	}
	scan.close();
 }
}
