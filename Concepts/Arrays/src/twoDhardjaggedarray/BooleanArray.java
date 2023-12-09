package twoDhardjaggedarray;

public class BooleanArray {
public static void main(String[] args) {
	boolean arr[][]=new boolean[2][];
	arr[0]=new boolean[2];
	arr[0][0]=true;
	arr[0][1]=false;
	arr[1]=new boolean[3];
	arr[1][0]=true;
	arr[1][1]=false;
	arr[1][2]=true;
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
