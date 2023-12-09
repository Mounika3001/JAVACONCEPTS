package threedhardcodedarrays;

public class DoubleArray {
public static void main(String[] args) {
	double arr[][][]=new double[2][2][2];
	arr[0][0][0]=548.875;
	arr[0][0][1]=834.95873;
	arr[0][1][0]=85.98275;
	arr[0][1][1]=089.298;
	arr[1][0][0]=37948.4548;
	arr[1][0][1]=93857.58;
	arr[1][0][1]=834.897;
	arr[1][1][0]=5089.835;
	arr[1][1][1]=3598.836;
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
				System.out.print(arr[i][j][k]+" ");
			}
			System.out.println();
		}
		System.out.println("=================================");
	}
}
}
