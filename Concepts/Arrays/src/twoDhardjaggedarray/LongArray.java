package twoDhardjaggedarray;

public class LongArray {
public static void main(String[] args) {
	long arr[][]=new long[3][];
	arr[0]=new long[3];
	arr[0][0]=542324;
	arr[0][1]=5366536;
	arr[0][2]=9876756;
	arr[1]=new long[1];
	arr[1][0]=358973865;
	arr[2]=new long[4];
	arr[2][0]=7583;
	arr[2][1]=8734576;
	arr[2][2]=84577345;
	arr[2][3]=5987;
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
