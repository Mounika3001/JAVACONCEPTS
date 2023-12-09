package com.UnaryOperators;

public class Incrementation {
public static void main(String[] args) {
	int a=22;
	int b=a++ + ++a + ++a + ++a + a++ + ++a;
	System.out.println("A: "+a+" B: "+b);
}
}
