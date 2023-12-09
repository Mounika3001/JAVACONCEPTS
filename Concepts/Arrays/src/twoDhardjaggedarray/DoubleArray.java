package twoDhardjaggedarray;

public class DoubleArray {
public static void main(String[] args) {
	double arr[][]=new double[2][];
	arr[0]=new double[2];
	arr[0][0]=30.30;
	arr[0][1]=10.10;
	arr[1]=new double[3];
	arr[1][0]=03.03;
	arr[1][1]=05.05;
	arr[1][2]=18.18;
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
			
}
}
