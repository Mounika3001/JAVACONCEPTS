package oneDarray;

import java.util.Scanner;

public class FloatArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array length");
	float f[]=new float[scan.nextInt()];
	System.out.println("Enter array of "+f.length+" elements to store in array");
	for(int i=0;i<=f.length-1;i++)
	{
		System.out.println("Enter float value "+i);
		f[i]=scan.nextFloat();
	}
	System.out.println("Array contents are: ");
	for (float g : f) {
		System.out.print(g+" ");
	}
	scan.close();
}
}
