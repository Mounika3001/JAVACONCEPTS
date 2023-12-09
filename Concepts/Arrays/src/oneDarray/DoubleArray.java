package oneDarray;

import java.util.Scanner;

public class DoubleArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array length");
	double d[]=new double[scan.nextInt()];
	System.out.println("Enter array of "+d.length+" elements to store in array");
	for(int i=0;i<=d.length-1;i++)
	{
		System.out.println("Enter the double value "+i);
		d[i]=scan.nextDouble();
	}
	System.out.println("Array contents are ");
	for (double e : d) {
		System.out.print(e+" ");
	}
	scan.close();
}
}
