package switchcontrolconstruct;

import java.util.Scanner;

public class ArithmeticSymbols {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter + or - or * or / to know about the operator");
		char opt=scan.next().charAt(0);
		switch(opt)
		{
		case '+':
		    System.out.println("Addition operator");
			break;
		case '-':
   		    System.out.println("Subtraction operator");
		    break;
     	case '*':
       		System.out.println("Multiplication operator");
    		break;
        case '/':
       		System.out.println("Division operator");
    		break;
        default:
        	System.out.println("Idiot see the msg carefullu");
	
		
	}
		scan.close();
	}

}
