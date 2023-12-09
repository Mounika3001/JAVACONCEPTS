package twoDhardcodedarrays;

public class IntArray {
public static void main(String[] args) {
	int[][]arr=new int[3][2];
	
	arr[0][0]=5;
	arr[0][1]=4;
	arr[1][0]=3;
	arr[1][1]=3;
	arr[2][0]=5;
	arr[2][1]=7;
	System.out.println("Array contents are ");
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
		System.out.print(arr[i][j]+" ");
	    }
	}
	
}
}
