package pattern.level5;

public class Pattern6 {
public static void main(String[] args) {
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=7;j++)
		{
			if(i==1||i==j||i+j==8)
			{
				System.out.print("*");
			}else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=7;j++)
		{
			if(j-i==3||i==4||i+j==5)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
