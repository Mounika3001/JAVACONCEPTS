package com.methodoverloading;

public class DisneyChai {
void getTea()
{
	System.out.println("Normal tea price is 10");
}
void getTea( int quantity)
{
	System.out.println("The cost of "+quantity+" teas price is "+(10*quantity));
}
void getTea(String name)
{
	System.out.println("the cost of "+name+" tea is: 15");
}
void getTea(String name, int quantity)
{
	System.out.println("The cost of "+name+ " tea of quantity "+quantity+" is "+(quantity*15));
}
}
