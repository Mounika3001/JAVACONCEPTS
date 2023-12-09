package com.methodoverloading;

import java.util.Scanner;

public class SubtractionApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter two integer values and two float values");
	int a=scan.nextInt();
	int b=scan.nextInt();
	float c=scan.nextFloat();
	float d=scan.nextFloat();
	System.out.println("Subtraction result: "+Subtraction.sub(c, d));
	System.out.println("Subtraction result: "+Subtraction.sub(c, b));
	System.out.println("Subtraction result: "+Subtraction.sub(a, d));
	System.out.println("Subtraction result: "+Subtraction.sub(a, b));
	
	scan.close();
}
}
