package twoDarray;

import java.util.Scanner;

public class ShortArray {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the array length");
    byte b[][]=new byte[scan.nextInt()][scan.nextInt()];
    for(int i=0;i<=b.length-1;i++)
    {
    	for(int j=0;j<=b[i].length-1;j++)
    	{
    		System.out.println("Enter array "+i+" value "+j);
    		b[i][j]=scan.nextByte();
    		
    	}
    }
    System.out.println("Array contents are");
    for(int i=0;i<=b.length-1;i++)
    {
    	for(int j=0;j<=b[i].length-1;j++)
    	{
    		System.out.print(b[i][j]+" ");
    		
    		
    		
    	}
    	System.out.println();
    }
    scan.close();
}
}
