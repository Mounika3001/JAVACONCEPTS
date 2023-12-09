package com.StaticSameClass;

import java.util.Scanner;

public class FirstMethod {
public static void main(String[] args) {
	FirstMethod.add();
}
public static void add()
{
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter two numbers to perform addition");
	int a=scan.nextInt();
	int b=scan.nextInt();
	System.out.println("Addition Result: "+(a+b));
	scan.close();
}
}
