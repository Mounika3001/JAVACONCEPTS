package arrays.level2;

import java.util.Scanner;

public class Arrayp4ForwardAndReverse {
public static void main(String[] args) {
	System.out.println("Enter the array length: ");
	Scanner scan = new Scanner(System.in);
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
	}
	printArray(arr);
	scan.close();
}
public static void printArray(int arr[])
{
	System.out.println("Forward direction");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Reverse direction");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]+" ");
		
	}
	System.out.println();
}
}
