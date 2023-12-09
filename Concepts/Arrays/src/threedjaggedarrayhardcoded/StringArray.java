package threedjaggedarrayhardcoded;

public class StringArray {
public static void main(String[] args) {
	String arr[][][]=new String[3][][];
	arr[0]=new String[2][];
	arr[0][0]=new String[3];
	arr[0][0][0]="Virat";
	arr[0][0][1]="Dhoni";
	arr[0][0][2]="Sachin";
	arr[0][1]=new String[3];
	arr[0][1][0]="Rohit";
	arr[0][1][1]="Shreyas";
	arr[0][1][2]="Rahul";
	arr[1]=new String[1][];
	arr[1][0]=new String[2];
	arr[1][0][0]="Bhuvi";
	arr[1][0][1]="Gill";
	arr[2]=new String[3][];
	arr[2][0]=new String[2];
	arr[2][0][0]="Shami";
	arr[2][0][1]="Jadeja";
	arr[2][1]=new String[3];
	arr[2][1][0]="Bumrah";
	arr[2][1][1]="Kuldeep";
	arr[2][1][2]="Chahal";
	arr[2][2]=new String[1];
	arr[2][2][0]="Surya";
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
		System.out.println("============================");
	}
	
}
}
