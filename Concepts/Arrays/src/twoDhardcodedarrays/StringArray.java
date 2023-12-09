package twoDhardcodedarrays;

public class StringArray {
public static void main(String[] args) {
	
	String arr[][]=new String[3][3];
	arr[0][0]="Mon";
	arr[0][1]="Tue";
	arr[0][2]="Wed";
	arr[1][0]="Thu";
	arr[1][1]="Fri";
	arr[1][2]="sat";
	arr[2][0]="sun";
	arr[2][1]="Jan";
	arr[2][2]="Feb";
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
