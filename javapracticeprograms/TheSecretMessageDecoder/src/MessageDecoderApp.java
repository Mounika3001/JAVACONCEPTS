import java.util.Scanner;

public class MessageDecoderApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter any character to find its unicode");
	char ch=scan.next().charAt(0);
	MessageDecoder md=new MessageDecoder();
	System.out.println(md.decodeCharacter(ch));
	scan.close();
}
}
