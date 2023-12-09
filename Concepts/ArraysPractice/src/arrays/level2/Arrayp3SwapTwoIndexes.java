package arrays.level2;

import java.util.Scanner;

public class Arrayp3SwapTwoIndexes {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array contents are: ");
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
	}
	System.out.println("Array contents are: ");
	System.out.println("Array contents before swapping");
	for (int i : arr) {
		System.out.print(i+" ");
	}
	System.out.println();
	System.out.println("Enter the two indexes to swap");
	
	int keya=scan.nextInt();
	int keyb=scan.nextInt();
	int temp;
	temp=arr[keya];
	arr[keya]=arr[keyb];
	arr[keyb]=temp;
	System.out.println("Array contents after swapping");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	scan.close();
}
}
