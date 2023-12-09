package threedjaggedarrayhardcoded;

public class ShortArray {
public static void main(String[] args) {
	short arr[][][]=new short[2][][];
	arr[0]=new short[3][];
	arr[0][0]=new short[1];
	arr[0][0][0]=21;
	arr[0][1]=new short[2];
	arr[0][1][0]=22;
	arr[0][1][1]=23;
	arr[0][2]=new short[1];
	arr[0][2][0]=24;
	arr[1]=new short[2][];
	arr[1][0]=new short[3];
	arr[1][0][0]=25;
	arr[1][0][1]=26;
	arr[1][0][2]=27;
	arr[1][1]=new short[2];
	arr[1][1][0]=28;
	arr[1][1][1]=29;
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
		System.out.println("==================================");
	}
}
}
