package pattern.level3;

public class Pattern9 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=2;j<=i;j++)
		{
			System.out.print(" ");
		}
		char ch='A';
		for(int j=5;j>=i;j-- )
		{
			System.out.print(ch);
			ch++;
		}
		System.out.println();
	}
}
}
