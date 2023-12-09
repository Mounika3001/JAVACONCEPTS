package twoDhardjaggedarray;

public class ShortArray {
public static void main(String[] args) {
	short arr[][]=new short[2][];
	arr[0]=new short[5];
	arr[0][0]=45;
	arr[0][1]=43;
	arr[0][2]=47;
	arr[0][3]=49;
	arr[0][4]=51;
	arr[1]=new short[3];
	arr[1][0]=63;
	arr[1][1]=65;
	arr[1][2]=67;
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
