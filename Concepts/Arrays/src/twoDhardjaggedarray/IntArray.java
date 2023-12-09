package twoDhardjaggedarray;

public class IntArray {
public static void main(String[] args) {
	int arr[][]=new int[2][];
	arr[0]=new int[3];
	arr[0][0]=5;
	arr[0][1]=7;
	arr[0][2]=12;
	arr[1]=new int[1];
	arr[1][0]=352;
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
