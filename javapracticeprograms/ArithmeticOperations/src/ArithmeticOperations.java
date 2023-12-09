import java.util.Scanner;

public class ArithmeticOperations {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter two perform subtraction");
	int a=scan.nextInt();
	int b=scan.nextInt();
	System.out.println("Enter two numbers to perform multiplication");
	int c=scan.nextInt();
	int d=scan.nextInt();
	System.out.println("Enter two numbers to perform division");
	int e=scan.nextInt();
	int f=scan.nextInt();
	System.out.println("Enter two numbers to find the reminder");
	int g=scan.nextInt();
	int h=scan.nextInt();
	System.out.println(subtractNumbers(a, b));
	System.out.println(multiplyNumbers(c, d));
	System.out.printf("%.2f\n",divideNumbers(e, f));
	System.out.println(findRemainder(g, h));
	scan.close();
	
}
public static int subtractNumbers(int num1, int num2)
{
	return num1-num2;
	
}

public static int multiplyNumbers(int num1, int num2)
{
	return num1*num2;
	
}

public static double divideNumbers(int num1, int num2)
{
	return num1/num2;
	
}

public static int findRemainder(int num1, int num2)
{
	return num1%num2;
	
}
}
