package threedhardcodedarrays;

public class StringArray {
public static void main(String[] args) {
	String arr[][][]=new String[2][1][2];
	arr[0][0][0]="ABC";
	arr[0][0][1]="DEF";
	arr[1][0][0]="GHI";
	arr[1][0][1]="JKL";
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
		System.out.println("================================");
	}
}
}
