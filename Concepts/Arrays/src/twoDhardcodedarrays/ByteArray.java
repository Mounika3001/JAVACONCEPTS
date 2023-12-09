package twoDhardcodedarrays;

public class ByteArray {
public static void main(String[] args) {
	byte arr[][]=new byte[4][3];
	arr[0][0]=3;
	arr[0][1]=34;
	arr[0][2]=4;
	arr[1][0]=3;
	arr[1][1]=10;
	arr[1][2]=18;
	arr[2][0]=30;
	arr[2][1]=9;
	arr[2][2]=5;
	arr[3][0]=13;
	arr[3][1]=27;
	arr[3][2]=26;
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
