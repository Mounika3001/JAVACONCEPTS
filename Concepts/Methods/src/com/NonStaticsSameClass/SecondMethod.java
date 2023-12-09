package com.NonStaticsSameClass;

import java.util.Scanner;

public class SecondMethod {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter two numbers to perform addition");
	int a=scan.nextInt();
	int b=scan.nextInt();
	SecondMethod sm=new SecondMethod();
	sm.add(a, b);
	scan.close();
}
public  void add(int a,int b)
{
	
	System.out.println("Addition Result: "+(a+b));
	
}
}
