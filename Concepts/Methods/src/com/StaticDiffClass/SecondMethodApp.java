package com.StaticDiffClass;

import java.util.Scanner;

public class SecondMethodApp {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter two numbers to perform addition");
	int a=scan.nextInt();
	int b=scan.nextInt();
	SecondMethod.add(a, b);
	scan.close();
}
}
