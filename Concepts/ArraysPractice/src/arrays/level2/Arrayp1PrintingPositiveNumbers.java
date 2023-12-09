package arrays.level2;
import java.util.Scanner;
public class Arrayp1PrintingPositiveNumbers {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
System.out.println("Enter the array length");
	int arr[]=new int[scan.nextInt()];
for(int i=0;i<=arr.length-1;i++)	{	
	System.out.println("Enter the array value "+i);
	arr[i]=scan.nextInt();
}
	System.out.println("all array contents ");
for (int i : arr) {
	System.out.print(i+" ");
}
System.out.println();
System.out.println("Array positive contents are: ");
for (int i : arr) {
	if(i>0)
	{		System.out.print(i+" ");
	}
}
scan.close();
	
}
}



