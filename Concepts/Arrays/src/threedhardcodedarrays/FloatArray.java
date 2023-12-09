package threedhardcodedarrays;

public class FloatArray {
public static void main(String[] args) {
	float arr[][][]=new float[2][3][2];
	arr[0][0][0]=24.23f;
	arr[0][0][1]=690.53908f;
	arr[0][1][0]=34982.978234f;
	arr[0][1][1]=428.245f;
	arr[0][2][0]=5389.385f;
	arr[1][0][0]=54.443f;
	arr[1][0][1]=4987.24987f;
	arr[1][1][0]=954.834f;
	arr[1][1][1]=35987.5874f;
	arr[1][2][0]=35798.89354f;
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
