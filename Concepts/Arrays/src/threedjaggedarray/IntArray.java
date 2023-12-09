package threedjaggedarray;

import java.util.Scanner;

public class IntArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 1d array length");
	int arr[][][]=new int[scan.nextInt()][][];
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("Enter 2d array length ");
		arr[i]=new int[scan.nextInt()][];
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("Enter 3d array length");
			arr[i][j]=new int[scan.nextInt()];
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
				System.out.println("Enter the school "+i+" class "+j+" student "+k+" marks is ");
				arr[i][j][k]=scan.nextInt();
			}
		}
	}
		System.out.println("Enter the array contents are: ");
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
			System.out.println("=====================");
		}
	scan.close();
}
}
