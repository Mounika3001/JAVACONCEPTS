package twoDhardcodedarrays;

public class CharArray {
public static void main(String[] args) {
	char arr[][]=new char[4][3];
	arr[0][0]='m';
	arr[0][1]='o';
	arr[0][2]='u';
	arr[1][0]='n';
	arr[1][1]='i';
	arr[1][2]='k';
	arr[2][0]='a';
	arr[2][1]='b';
	arr[2][2]='c';
	arr[3][0]='d';
	arr[3][1]='e';
	arr[3][2]='f';
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
