package twoDhardcodedarrays;

public class DoubleArray {
public static void main(String[] args) {
	double d[][]=new double[5][3];
	d[0][0]=100;
	d[0][1]=99;
	d[0][2]=98;
	d[1][0]=97;
	d[1][1]=96;
	d[1][2]=95;
	d[2][0]=94;
	d[2][1]=93;
	d[2][2]=92;
	d[3][0]=91;
	d[3][1]=90;
	d[3][2]=89;
	d[4][0]=88;
	d[4][1]=87;
	d[4][2]=86;
	for(int i=0;i<=d.length-1;i++)
	{
		for(int j=0;j<=d[i].length-1;j++)
		{
			System.out.print(d[i][j]+" ");
		}
		System.out.println();
	}
			
}
}
