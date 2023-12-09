package twoDhardcodedarrays;

public class FloatArray {
public static void main(String[] args) {
	float arr[][]=new float[2][2];
	arr[0][0]=3.3f;
	arr[0][1]=10.10f;
	arr[1][0]=18.18f;
	arr[1][1]=30.30f;
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
