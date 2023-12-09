package threedarray;

import java.util.Scanner;

public class BooleanArray {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter 1d, 2d , 3d array length: ");
	boolean arr[][][]=new boolean[scan.nextInt()][scan.nextInt()][scan.nextInt()];
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
				System.out.println("Enter the school "+i+" class "+j+" teacher "+k+" is married:");
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
    	 System.out.println("====================================");
     }
     scan.close();
}
}
