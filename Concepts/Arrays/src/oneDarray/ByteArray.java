package oneDarray;

import java.util.Scanner;

public class ByteArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array length");
	
byte b[]=new byte[scan.nextInt()];
System.out.println("Enter array of "+b.length+" elements to store in array");
for(int i=0;i<=b.length-1;i++)
{
	System.out.println("Enter byte value"+i);
	b[i]=scan.nextByte();
}
System.out.println("Array contents are ");
for (byte c : b) {
	System.out.print(c+" ");
}
scan.close();
}
}
