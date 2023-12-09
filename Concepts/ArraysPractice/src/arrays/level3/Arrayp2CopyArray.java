package arrays.level3;

import java.util.Scanner;

public class Arrayp2CopyArray {
public static void main(String[] args) {
	System.out.println("Enter the array length");
	Scanner scan= new Scanner(System.in);
	int arr1[]=new int[scan.nextInt()];
    for(int i=0;i<=arr1.length-1;i++)
    {
    	arr1[i]=scan.nextInt();
    }
    scan.close();
    int arr2[]=new int[arr1.length];
    for(int i=0;i<=arr2.length-1;i++)
    {
    	arr2[i]=arr1[i];
    }
    
    System.out.println("The copied contents are: ");
    for (int i : arr2) {
		System.out.print(i+" ");
	}
    
}
}
