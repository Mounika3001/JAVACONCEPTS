package twoDarray;

import java.util.Scanner;

public class CharArray {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter array length");
	char ch[][]=new char[scan.nextInt()][scan.nextInt()];
	for(int i=0;i<=ch.length-1;i++)
	{
		
		for(int j=0;j<=ch[i].length-1;j++)
		{
			System.out.println("Enter array "+i+" value "+j);
			ch[i][j]=scan.next().charAt(0);
		}
	}
	System.out.println("Array contents are: ");
	for(int i=0;i<=ch.length-1;i++)
	{
		for(int j=0;j<=ch[i].length-1;j++)
		{
			System.out.print(ch[i][j]+" ");
		}
		System.out.println();
	}
	scan.close();
	
}
}
