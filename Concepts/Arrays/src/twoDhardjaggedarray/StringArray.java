package twoDhardjaggedarray;

public class StringArray {
public static void main(String[] args) {
	String arr[][]=new String[4][];
	arr[0]=new String[3];
	arr[0][0]="ABC";
	arr[0][1]="DEF";
	arr[0][2]="GHI";
	arr[1]=new String[2];
	arr[1][0]="JKL";
	arr[1][1]="MNO";
	arr[2]=new String[1];
	arr[2][0]="PQR";
	arr[3]=new String[3];
	arr[3][0]="STU";
	arr[3][1]="VWX";
	arr[3][2]="YZ";
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
