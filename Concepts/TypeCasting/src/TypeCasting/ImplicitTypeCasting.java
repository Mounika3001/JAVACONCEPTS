package TypeCasting;

import java.util.Scanner;

public class ImplicitTypeCasting {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int a=200;
	double d=a;//Explicit type casting
	System.out.println("Implicit type casting"+d);
	
	scan.close();
}
}
