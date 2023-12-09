package threedjaggedarrayhardcoded;

public class FloatArray {
public static void main(String[] args) {
	float arr[][][]=new float[2][][];
	arr[0]=new float[2][];
	arr[0][0]=new float[1];
	arr[0][0][0]=11.11f;
	arr[0][1]=new float[2];
	arr[0][1][0]=22.22f;
	arr[0][1][1]=33.33f;
	arr[1]=new float[1][];
	arr[1][0]=new float[4];
	arr[1][0][0]=44.44f;
	arr[1][0][1]=55.55f;
	arr[1][0][2]=66.66f;
	arr[1][0][3]=77.77f;
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
		System.out.println("====================");
	}
}
}
