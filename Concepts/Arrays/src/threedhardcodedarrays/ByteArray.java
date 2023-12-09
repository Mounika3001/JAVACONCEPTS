package threedhardcodedarrays;

public class ByteArray {
public static void main(String[] args) {
	System.out.println("enter 1d, 2d, 3d array length: ");
	byte arr[][][]=new byte[2][2][2];
	arr[0][0][0]=1;
	arr[0][0][1]=2;
	arr[0][1][0]=3;
	arr[0][1][1]=4;
	arr[1][0][0]=1;
	arr[1][0][1]=2;
	arr[1][1][0]=3;
	arr[1][1][1]=4;
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
		System.out.println("============================");
	}
	
	
}
}
