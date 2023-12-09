package threedhardcodedarrays;

public class CharArray {
public static void main(String[] args) {
	
	char arr[][][]=new char[3][2][1];
	arr[0][0][0]='A';
	arr[0][1][0]='B';
	arr[1][0][0]='C';
	arr[1][1][0]='D';
	arr[2][0][0]='E';
	arr[2][1][0]='F';
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
