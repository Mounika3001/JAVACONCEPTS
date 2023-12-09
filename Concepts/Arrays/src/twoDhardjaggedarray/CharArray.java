package twoDhardjaggedarray;

public class CharArray {
public static void main(String[] args) {
	char arr[][]=new char[4][];
	arr[0]=new char[3];
	arr[0][0]='A';
	arr[0][1]='B';
	arr[0][2]='C';
	arr[1]=new char[2];
	arr[1][0]='D';
	arr[1][1]='E';
	arr[2]=new char[3];
	arr[2][0]='F';
	arr[2][1]='G';
	arr[2][2]='H';
	arr[3]=new char[1];
	arr[3][0]='I';
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
