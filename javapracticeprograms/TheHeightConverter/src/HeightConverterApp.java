import java.util.Scanner;

public class HeightConverterApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number of inches to convert it into feet");
	double inches=scan.nextDouble();
	HeightConverter hc=new HeightConverter();
	System.out.printf("%.2f",hc.convertInchesToFeet(inches));
	scan.close();
}
}
