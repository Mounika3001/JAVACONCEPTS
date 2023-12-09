package arrays.level3;

import java.util.Scanner;

public class ArraySearchp1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the array length");
	int arr[]=new int[scan.nextInt()];
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("Enter the value "+i);
		arr[i]=scan.nextInt();
	}
	System.out.println("Enter the target to find ");
	int key=scan.nextInt();
	Searchp1 search=new Searchp1();
	boolean res=search.isPresent(arr, key);
	if(res)
	{
		System.out.println("Key is found");
	}else
	{
		System.out.println("Key is not found");
	}
	
}
}
