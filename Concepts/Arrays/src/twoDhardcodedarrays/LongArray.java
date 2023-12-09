package twoDhardcodedarrays;

public class LongArray {
public static void main(String[] args) {
	long l[][]=new long[4][3];
	l[0][0]=51;
	l[0][1]=52;
	l[0][2]=53;
	l[1][0]=54;
	l[1][1]=55;
	l[1][2]=56;
	l[2][0]=57;
	l[2][1]=58;
	l[2][2]=59;
	l[3][0]=60;
	l[3][1]=61;
	l[3][2]=62;
	for(int i=0;i<=l.length-1;i++)
	{
		for(int j=0;j<=l[i].length-1;j++)
		{
			System.out.print(l[i][j]+" ");
		}
		System.out.println();
	}
}
}
