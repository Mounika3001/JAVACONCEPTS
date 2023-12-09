package twoDhardjaggedarray;

public class FloatArray {
public static void main(String[] args) {
	float arr[][]=new float[2][];
	arr[0]=new float[4];
	arr[0][0]=11.11f;
	arr[0][1]=22.22f;
	arr[0][2]=33.33f;
	arr[0][3]=44.44f;
	arr[1]=new float[2];
	arr[1][0]=55.55f;
	arr[1][1]=66.66f;
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
