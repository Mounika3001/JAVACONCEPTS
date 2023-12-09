package pattern.characters;

public class Pattern11 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=4;j++)
		{
			if(j==1||(i+j==5||i-j==1))
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
