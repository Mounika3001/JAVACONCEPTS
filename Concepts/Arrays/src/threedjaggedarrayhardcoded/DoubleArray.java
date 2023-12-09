package threedjaggedarrayhardcoded;

public class DoubleArray {
public static void main(String[] args) {
	double arr[][][]=new double[2][][];
	arr[0]=new double[2][];
	arr[0][0]=new double[4];
	arr[0][0][0]=1111.1111;
	arr[0][0][1]=2222.2222;
	arr[0][0][2]=3333.3333;
	arr[0][0][3]=4444.4444;
	arr[0][1]=new double[1];
	arr[0][1][0]=5555.5555;
	arr[1]=new double[1][];
	arr[1][0]=new double[3];
	arr[1][0][0]=6666.6666;
	arr[1][0][1]=7777.7777;
	arr[1][0][2]=8888.8888;
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
		System.out.println("==========================");
	}
}
}
