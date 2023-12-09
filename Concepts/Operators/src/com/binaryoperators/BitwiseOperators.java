package com.binaryoperators;

import java. util.Scanner;

public class BitwiseOperators {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 2 numbers to perform all bitwise operations");
	int a=scan.nextInt();
	int b=scan.nextInt();
	System.out.println("Bitwise AND Result: "+(a&b));
	System.out.println("Bitwise OR Result: "+(a|b));
	System.out.println("Bitwise NOT Result: "+(~b));
	System.out.println("Bitwise XOR Result: "+(a^b));
	System.out.println("Bitwise Left Shift Operator: "+(a<<2));
	System.out.println("Bitwise Right Shift Operator: "+(a>>2));
	scan.close();
}
}
