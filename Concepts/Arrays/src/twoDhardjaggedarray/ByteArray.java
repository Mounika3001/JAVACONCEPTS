package twoDhardjaggedarray;

public class ByteArray {
public static void main(String[] args) {
	byte arr[][]=new byte[3][];
	arr[0]=new byte[2];
	arr[0][0]=99;
	arr[0][1]=98;
	
	arr[1]=new byte[3];
	arr[1][0]=96;
	arr[1][1]=95;
	arr[1][2]=94;
	arr[2]=new byte[1];
	arr[2][0]=97;
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
