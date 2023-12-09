package threedhardcodedarrays;

public class BooleanArray {
public static void main(String[] args) {
	boolean arr[][][]=new boolean[2][3][1];
	arr[0][0][0]=true;
	arr[0][1][0]=false;
	arr[0][2][0]=true;
	arr[1][0][0]=true;
	arr[1][1][0]=false;
	arr[1][2][0]=true;
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
