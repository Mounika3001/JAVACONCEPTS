import java.util.Scanner;

public class FinanceCalculatorApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the principal value");
	double principal=scan.nextDouble();
	System.out.println("Enter the rate of interest");
	double rate=scan.nextDouble();
	System.out.println("Enter the number of years ");
	double time=scan.nextDouble();
	FinanceCalcutor fc=new FinanceCalcutor();
	System.out.printf("%.2f",fc.calculateSimpleInterest(principal, rate, time));
	scan.close();
}
}
