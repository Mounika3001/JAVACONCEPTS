package com.binaryoperators;

public class BitwiseOperatorsHardCoded {
public static void main(String[] args) {
	int a=10;
	int b=5;
	System.out.println("Bitwise AND Result: "+(a&b));
	System.out.println("Bitwise OR Result: "+(a|b));
	System.out.println("Bitwise NOT Result: "+(~b));
	System.out.println("Bitwise XOR Result: "+(a^b));
	System.out.println("Bitwise Left Shift Operator: "+(a<<2));
	System.out.println("Bitwise Right Shift Operator: "+(a>>2));
}
}
