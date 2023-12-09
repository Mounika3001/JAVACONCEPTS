package pattern.level5;

public class pattern12 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=48;j++)
		{
			if(((i==1&&(j<6))||j==3)||
					(j==7||j==11||(i==3&&(j>6&&j<12)))||
					(j==13||j==17||(i==1&&(j>12&&j<18)))||(i==3&&(j>12&&j<18))
					||(j==19||j==23||j-i==18)||
					(j==25||(i+j==29&&j!=24)||(j-i==23)&&j!=24)||
					(j-i==31&&(j!=35&&j!=36)||i+j==37&&(j!=32&&j!=33)||(i==4&&j==34)||(i==5&&j==34 ))
					||(j==38||j==42||(i==1&&(j>38&&j<42))||(i==5&&(j>38&&j<42)))
					||(j==44||j==48||i==5&&(j>44&&j<48)))
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
