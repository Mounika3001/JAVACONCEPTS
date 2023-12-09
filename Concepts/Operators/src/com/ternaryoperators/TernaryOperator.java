package com.ternaryoperators;

import java.util.Scanner;

public class TernaryOperator {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the age");
	int age=scan.nextInt();
	System.out.println((age>18)?" Eligible for voting":" Not Eligible for voting");
	scan.close();
}
}
