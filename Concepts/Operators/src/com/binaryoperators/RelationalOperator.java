package com.binaryoperators;

import java.util.Scanner;

public class RelationalOperator {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter two boolean values true/false");
	boolean a=scan.nextBoolean();
	boolean b=scan.nextBoolean();
	System.out.println("AND Operation Result: "+(a&&b));
	System.out.println("OR Operation Result: "+(a||b));
	scan.close();
}
}
