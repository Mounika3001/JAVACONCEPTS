package threedhardcodedarrays;

public class IntArray {
public static void main(String[] args) {
	System.out.println("Enter the 1d, 2d, 3d array length");
	int arr[][][]=new int[3][1][3];
	arr[0][0][0]=1001;
	arr[0][0][1]=1002;
	arr[0][0][2]=1003;
	arr[1][0][0]=1004;
	arr[1][0][1]=1005;
	arr[1][0][2]=1006;
	arr[2][0][0]=1001;
	arr[2][0][1]=1002;
	arr[2][0][2]=1003;
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
		System.out.println("=====================================");
	}
	
	
	
}
}
