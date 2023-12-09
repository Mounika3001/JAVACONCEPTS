package threedjaggedarrayhardcoded;

public class CharArray {
public static void main(String[] args) {
	char arr[][][]=new char[2][][];
	arr[0]=new char[2][];
	arr[0][0]=new char[2];
	arr[0][0][0]='a';
	arr[0][0][1]='b';
	arr[0][1]=new char[1];
	arr[0][1][0]='c';
	arr[1]=new char[3][];
	arr[1][0]=new char[1];
	arr[1][0][0]='d';
	arr[1][1]=new char[2];
	arr[1][1][0]='e';
	arr[1][1][1]='f';
	arr[1][2]=new char[3];
	arr[1][2][0]='g';
	arr[1][2][1]='h';
	arr[1][2][2]='i';
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
		System.out.println("===========================");
	}
}
}
