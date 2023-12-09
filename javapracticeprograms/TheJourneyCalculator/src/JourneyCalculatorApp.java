import java.util.Scanner;

public class JourneyCalculatorApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the speed");
	double speed=scan.nextDouble();
	System.out.println("Enter the time taken to travel");
	double time=scan.nextDouble();
	JourneyCalculator jc=new JourneyCalculator();
	System.out.printf("%.2f",jc.calculateDistance(speed, time));
	scan.close();
}
}
