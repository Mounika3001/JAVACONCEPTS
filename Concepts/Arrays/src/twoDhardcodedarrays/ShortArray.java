package twoDhardcodedarrays;

public class ShortArray {
public static void main(String[] args) {
	short arr[][]=new short[3][2];
	arr[0][0]=1;
	arr[0][1]=2;
	arr[1][0]=3;
	arr[1][1]=4;
	arr[2][0]=5;
	arr[2][1]=6;
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
