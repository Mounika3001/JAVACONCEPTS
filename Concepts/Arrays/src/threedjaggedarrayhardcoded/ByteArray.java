package threedjaggedarrayhardcoded;

public class ByteArray {
public static void main(String[] args) {
	byte arr[][][]=new byte[3][][];
	arr[0]=new byte[3][];
	arr[0][0]=new byte[1];
	arr[0][0][0]=100;
	arr[0][1]=new byte[2];
	arr[0][1][0]=99;
	arr[0][1][1]=98;
	arr[0][2]=new byte[3];
	arr[0][2][0]=97;
	arr[0][2][1]=96;
	arr[0][2][2]=95;
	arr[1]=new byte[1][];
	arr[1][0]=new byte[1];
	arr[1][0][0]=94;
	arr[1]=new byte[2][];
	arr[1][0]=new byte[2];
	arr[1][0][0]=93;
	arr[1][0][1]=92;
	arr[1][1]=new byte[1];
	arr[1][1][0]=91;
	arr[2]=new byte[2][];
	arr[2][0]=new byte[2];
	arr[2][0][0]=90;
	arr[2][0][1]=89;
	arr[2][1]=new byte[1];
	arr[2][1][0]=88;
	
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
