import java.util.Scanner;

public class HalveTheNumber {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number to halve the number");
	double n=scan.nextDouble();
	System.out.printf("%.2f",halveTheNumber(n));
	scan.close();
}
public static double halveTheNumber(double num)
{
	return num/2.0;
}
}
