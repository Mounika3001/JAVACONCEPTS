package twoDjaggedarray;

import java.util.Scanner;

public class FloatArray {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter 1d array length");
	float arr[][]=new float[scan.nextInt()][];
	for(int i=0;i<=arr.length-1;i++)
	{
	System.out.println("Enter the 2d array length");
		arr[i]=new float[scan.nextInt()];
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("Enter the class "+i+" student "+j+" height");
			arr[i][j]=scan.nextFloat();
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
