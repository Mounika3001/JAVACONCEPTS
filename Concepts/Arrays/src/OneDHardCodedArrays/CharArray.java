package OneDHardCodedArrays;

public class CharArray {
public static void main(String[] args) {
	char ch[]=new char[5];
	ch[0]='a';
	ch[1]='b';
	ch[2]='c';
	ch[3]='d';
	ch[4]='e';
	System.out.println("Array contents are");
	for (char c : ch) {
		System.out.print(c+" ");
	}
}
}
