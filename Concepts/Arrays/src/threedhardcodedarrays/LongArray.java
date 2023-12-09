package threedhardcodedarrays;

public class LongArray {
public static void main(String[] args) {
	long arr[][][]=new long[2][1][3];
	arr[0][0][0]=54287743;
	arr[0][0][1]=87424;
	arr[0][0][2]=8428795;
	arr[1][0][0]=5893;
	arr[1][0][1]=9874785;
	arr[1][0][2]=95887542;
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
		System.out.println("====================================");
	}
}
}
