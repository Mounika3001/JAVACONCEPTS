import java.util.Scanner;

public class CubeMystery {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number to find the cube of it");
	int n=scan.nextInt();
	System.out.println(cubeNumber(n));
	scan.close();
}
public static int cubeNumber(int num)
{
	return num*num*num;
			
}
}
