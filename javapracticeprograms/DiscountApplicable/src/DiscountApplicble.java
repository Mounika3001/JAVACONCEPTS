import java.util.Scanner;

public class DiscountApplicble {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the purchase amount in dollars");
	double purchaseAmount=scan.nextDouble();
	checkDiscount(purchaseAmount);
	scan.close();
}
public static void checkDiscount(double purchaseAmount) 
{ 
if(purchaseAmount>=100)
{
	System.out.println("Discount Applicable");
}
} 
}
