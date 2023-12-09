package arrays.level2;

import java.util.Scanner;

public class ArrayP2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the two values to swap");
	int a=scan.nextInt();
	int b=scan.nextInt();
	System.out.println("Values before swapping");
	System.out.println(a+" "+b);
	int temp;
	temp=a;
	a=b;
	b=temp;
	System.out.println("Values after swapping ");
	System.out.println(a+" "+b);
	scan.close();
	
}
}
