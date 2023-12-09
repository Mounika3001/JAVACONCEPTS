package com.NonModularisation;

import java.util.Scanner;

public class NonModularisedCode {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter two numbers ");
	int a =scan.nextInt();
	int b=scan.nextInt();
	int c=a+b;
	System.out.println("Addition Result: "+c);
	int d=a-b;
	System.out.println("Subtraction Result:"+d);
	int e=a*b;
	System.out.println("Multiplication Result: "+e);
	int f=a/b;
	System.out.println("Division Result: "+f);
	int g=a%b;
	System.out.println("Remainder Result: "+g);
	scan.close();
}

}
