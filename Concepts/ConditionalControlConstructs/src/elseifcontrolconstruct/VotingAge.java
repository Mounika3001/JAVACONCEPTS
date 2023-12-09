package elseifcontrolconstruct;

import java.util.Scanner;

public class VotingAge {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your age");
	int age=scan.nextInt();
    if(age>18)
    {
    	System.out.println("Your are eligible for voting");
    }
    else
    {
    	System.out.println("Your are not eligible for voting");
    }
    scan.close();
}
}
