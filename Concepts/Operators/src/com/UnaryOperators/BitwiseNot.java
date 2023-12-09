package com.UnaryOperators;

import java.util.Scanner;

public class BitwiseNot {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter a number a number to find its bitwise value and logical value");
	int a=scan.nextInt();
	System.out.println("Bitwise Not "+~a);
	scan.close();
}
}
