package threedhardcodedarrays;

public class ShortArray {
public static void main(String[] args) {
	short arr[][][]=new short[2][1][3];
	arr[0][0][0]=300;
	arr[0][0][1]=301;
	arr[0][0][2]=302;
	arr[1][0][0]=303;
	arr[1][0][1]=304;
	arr[1][0][2]=305;
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
		System.out.println("============================="); 
	}
}
}
