package arrays.level1;

import java.util.Scanner;

public class Arrayp2 {
public static void main(String[] args) {
	System.out.println("Enter the array length");
	Scanner scan = new Scanner(System.in);
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("Enter the array value "+i);
		arr[i]=scan.nextInt();
	}
	System.out.println("Array contents before incrementing by 5");
	for (int i : arr) {
		System.out.print(i+" ");
	}
	System.out.println();
	System.out.println("Array contents after incrementing by 5");
	for (int i : arr) {
		System.out.println((i+5)+" ");
	}
	scan.close();
}
}
