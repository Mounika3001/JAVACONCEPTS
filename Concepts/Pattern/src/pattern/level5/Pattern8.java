package pattern.level5;

public class Pattern8 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i==1||i==5||j==1||j==5||i==j||i+j==6)
			{
				System.out.print("O");
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
