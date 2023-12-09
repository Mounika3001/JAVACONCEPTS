package com.methodoverloading;

public class Subtraction {
public static int sub(int a, int b)
{
	return b-a;
}
public static float sub(float a, float b)
{
	return b-a;
}
public static float sub(float a, int b)
{
	return a-b;
}
public static float sub(int a, float b)
{
	return a-b;
}
}
