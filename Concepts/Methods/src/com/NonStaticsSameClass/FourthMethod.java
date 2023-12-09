package com.NonStaticsSameClass;

import java.util.Scanner;

public class FourthMethod {
public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter two numbers to perform addition");
		int a=scan.nextInt();
		int b=scan.nextInt();
		FourthMethod fourthMethod = new FourthMethod();
		int res=fourthMethod.add(a,b);
		System.out.println("Addition Result: "+res);
		scan.close();
	
}

public int add(int a, int b) {
	
	return a+b;
}

}
