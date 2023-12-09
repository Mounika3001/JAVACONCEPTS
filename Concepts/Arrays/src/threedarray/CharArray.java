package threedarray;

import java.util.Scanner;

public class CharArray {
public static void main(String[] args) {
	System.out.println("Enter 1d, 2d, 3d array lengths");
	Scanner scan = new Scanner(System.in);
	char arr[][][]=new char[scan.nextInt()][scan.nextInt()][scan.nextInt()];
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
				System.out.println("Enter school "+i+" class "+j+" student "+k+" grade is ");
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
		System.out.println("=======================================");
	}
	scan.close();
}
}
