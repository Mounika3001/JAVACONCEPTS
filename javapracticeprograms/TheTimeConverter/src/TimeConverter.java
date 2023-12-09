import java.util.Scanner;

public class TimeConverter {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number of minutes to convert it into hours");
	int minutes=scan.nextInt();
	System.out.println(convertToHours(minutes));
	scan.close();
}
public static double convertToHours(int minutes)
{
	return minutes/60.0;
}
}
