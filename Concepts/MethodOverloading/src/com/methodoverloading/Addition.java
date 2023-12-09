package com.methodoverloading;

public class Addition {
	void add(int a, int b)
	{
		System.out.println("Addition Result: "+(a+b));
	}
	void add(int a, int b, int c)
	{
		System.out.println("Addition Result: "+(a+b));
	}
    void add(int a, float b)
    {
    	System.out.println("Addition Result: "+(a+b));
    }
    void add(double a, double b)
    {
    	System.out.println("Addition Result: "+(a+b));
    }
    void add(float a , int b)
    {
    	System.out.println("Addition Result: "+(a+b));
    }
    void add(float a, double b)
    {
    	System.out.println("Addition Result: "+(a+b));
    }
    void add(double a, float b)
    {
    	System.out.println("Addition Result: "+(a+b));
    }
}
