package pattern.characters;

public class Pattern13 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
	for(int j=1;j<=5;j++)
	{
		if(j==1||j==5||(i==j&&(i!=4&&j!=4))||(i+j==6&&(i!=4&&j!=2)))
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
