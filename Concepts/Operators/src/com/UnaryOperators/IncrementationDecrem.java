package com.UnaryOperators;

public class IncrementationDecrem {
public static void main(String[] args) {
	int a=10;
	int b=a++ + ++a + a-- + --a + a++ + ++a + a-- + ++a;
	System.out.println("A: "+a+" B: "+b);
}
}
