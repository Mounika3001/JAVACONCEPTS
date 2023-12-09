package com.StaticDiffClass;

import java.util.Scanner;

public class ThirdMethod {
public static int add()
{
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter two numbers to perform addition");
	int a=scan.nextInt();
	int b=scan.nextInt();
	scan.close();
	return a+b;
}
}
