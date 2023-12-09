package twoDjaggedarray;

import java.util.Scanner;

public class ByteArray {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the length of array");
	byte arr[][]=new byte[scan.nextInt()][];
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("Enter the 2d array length");
		arr[i]=new byte[scan.nextInt()];
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("Enter the class "+i+" student "+j+" marks ");
			arr[i][j]=scan.nextByte();
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
