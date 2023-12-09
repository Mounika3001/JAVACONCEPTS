package com.NonStaticsSameClass;

import java.util.Scanner;

public class ThirdMethod {
public static void main(String[] args) {
	ThirdMethod thirdMethod = new ThirdMethod();
	int res=thirdMethod.add();
	System.out.println("AdditionResult: "+res);
}
public  int add()
{
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter two numbers to perform addition");
	int a=scan.nextInt();
	int b=scan.nextInt();
	
	scan.close();
	return a+b;
}
}
