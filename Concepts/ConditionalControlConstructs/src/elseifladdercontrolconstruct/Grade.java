package elseifladdercontrolconstruct;

import java.util.Scanner;

public class Grade {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter your marks");
   int marks=scan.nextInt();
   if(marks>90 && marks<=100)
   {
	   System.out.println("A+ grade");
   }
   else if(marks>80 && marks<=90)
   {
	   System.out.println("A grade");
   }
   else if(marks>70 && marks<=80)
   {
	   System.out.println("B grade");
   }
   else if(marks>60 && marks<=70)
   {
	   System.out.println("C grade");
   }
   else if(marks>50 && marks<=60)
   {
	   System.out.println("D grade");
   }
   else
   {
	   System.out.println("Fail");
   }
   scan.close();
}
}
