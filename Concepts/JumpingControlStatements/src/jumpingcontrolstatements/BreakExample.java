package jumpingcontrolstatements;

public class BreakExample {
public static void main(String[] args) {
	for(int i=1;i<=10;i++)
	{
		System.out.println(i);
		if(i==3)
		{
			break;
		}
	}
	System.out.println("Out of construct");
}
}
