package threedjaggedarrayhardcoded;

public class LongArray {
public static void main(String[] args) {
	long arr[][][]=new long[1][][];
	arr[0]=new long[5][];
	arr[0][0]=new long[2];
	arr[0][0][0]=12345;
	arr[0][0][1]=23456;
	arr[0][1]=new long[3];
	arr[0][1][0]=34567;
	arr[0][1][1]=45678;
	arr[0][1][2]=56789;
	arr[0][2]=new long[1];
	arr[0][2][0]=678901;
	arr[0][3]=new long[2];
	arr[0][3][0]=789012;
	arr[0][3][1]=890123;
	arr[0][4]=new long[3];
	arr[0][4][0]=901234;
	arr[0][4][1]=01234;
	arr[0][4][2]=12345;
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
		System.out.println("===============================");
	}
}
}
