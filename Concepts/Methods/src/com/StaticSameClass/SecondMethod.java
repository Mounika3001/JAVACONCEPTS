package com.StaticSameClass;

import java.util.Scanner;

public class SecondMethod {
public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter two numbers to perform addition");
		int a=scan.nextInt();
		int b=scan.nextInt();
		SecondMethod.add(a, b);
		scan.close();
	
}
public static void add(int a, int b)
{
	System.out.println("Addition result"+(a+b));
}
}
