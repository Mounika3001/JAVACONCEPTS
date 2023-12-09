package com.methodoverloading;

public class DisneyChaiApp {
public static void main(String[] args) {
	DisneyChai chai=new DisneyChai();
	chai.getTea();
	chai.getTea(5);
	chai.getTea("Ginger");
	chai.getTea("Lemon", 5);
	
}
}
