package com.StaticSameClass;

import java.util.Scanner;

public class ThirdMethod {
public static void main(String[] args) {
	int res=ThirdMethod.add();
	System.out.println("Addition Result: "+res);
}
public static int  add()
{
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter two numbers to perform addition");
	int a=scan.nextInt();
	int b=scan.nextInt();
	scan.close();
	return a+b;
	
}
}
