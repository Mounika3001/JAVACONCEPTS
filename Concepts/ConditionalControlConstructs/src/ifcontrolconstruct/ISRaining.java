package ifcontrolconstruct;

import java.util.Scanner;

public class ISRaining {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter true/ false it is raining or not");
	boolean israining=scan.nextBoolean();
	//simple if conditional construct
	if(israining==true)
	{
		System.out.println("It is raining");
	}
	System.out.println("Have a good day");
	scan.close();
}
}
