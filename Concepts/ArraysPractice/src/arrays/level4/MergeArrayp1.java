package arrays.level4;

import java.util.Scanner;

public class MergeArrayp1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the first array length");
	int arr1[]=new int[scan.nextInt()];
	for(int i=0;i<=arr1.length-1;i++)
	{
		System.out.println("Enter the array1 value "+i);
		arr1[i]=scan.nextInt();
	}
	System.out.println("Enter the second array length");
	int arr2[]=new int[scan.nextInt()];
	for(int i=0;i<=arr2.length-1;i++ )
	{
		arr2[i]=scan.nextInt();
	}
	
}
}
