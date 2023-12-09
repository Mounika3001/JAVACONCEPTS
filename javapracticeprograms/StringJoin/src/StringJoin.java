import java.util.Scanner;

public class StringJoin {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter two strings two concatenate");
	String str1=scan.nextLine();
	String str2=scan.nextLine();
	System.out.println(joinStrings(str1, str2));
	scan.close();
	}
public static String joinStrings(String s1,String s2)
{
	return s1+s2;
}
}
