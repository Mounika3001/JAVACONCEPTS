package com.NonStaticsSameClass;

import java.util.Scanner;

public class FirstMethod {
public static void main(String[] args) {
	FirstMethod fm=new FirstMethod();
	fm.add();
}
public  void add()
{
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter two numbers to perform addition");
	int a=scan.nextInt();
	int b=scan.nextInt();
	System.out.println("Addition Result: "+(a+b));
	scan.close();
}
}
