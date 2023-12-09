package threedarray;

import java.util.Scanner;

public class LongArray {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter 1d, 2d, 3d array lengths are ");
	Long arr[][][]=new Long[scan.nextInt()][scan.nextInt()][scan.nextInt()];
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
				System.out.println("Enter the company"+i+" employee "+j+" id "+k+" salary is ");
				arr[i][j][k]=scan.nextLong();
			}
		}
	}
	System.out.println("Array contents are ");
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
		System.out.println("============================================");
	}
	scan.close();
}
}
