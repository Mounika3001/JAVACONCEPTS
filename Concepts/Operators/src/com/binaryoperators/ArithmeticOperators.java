package com.binaryoperators;

import java.util.Scanner;

public class ArithmeticOperators {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter two numbers ");
	int a=scan.nextInt();
	int b=scan.nextInt();
	System.out.println("Addition Result: "+(a+b));
	System.out.println("Subtraction Result: "+(a-b));
	System.out.println("Multiplication Result: "+(a*b));
	System.out.println("Division Result: "+(a/b));
	System.out.println("Remainder Result: "+(a%b));
	scan.close();
}
}
