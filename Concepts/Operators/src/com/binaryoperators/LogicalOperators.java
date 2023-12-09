package com.binaryoperators;

import java.util.Scanner;

public class LogicalOperators {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter two numbers");
	int a=scan.nextInt();
	int b=scan.nextInt();
	System.out.println("Equal to Result: "+(a==b));
	System.out.println("Not Equal to Result: "+(a!=b));
	System.out.println("Greater Than Result: "+(b>a));
	System.out.println("Less Than Result: "+(a<b));
	System.out.println("Greater Than Or Equal to"+(a>=b));
	System.out.println("Less Than or Equal to "+(a<=b));
	scan.close();
}
}
