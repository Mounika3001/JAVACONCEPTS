package constructors;

import java.util.Scanner;

public class PrinterApp {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter brand");//brands like HP, dell
		String brand=scan.next();
		System.out.println("enter color of printer");
		String color=scan.next();
		System.out.println("enter price");
		int price=scan.nextInt();
		System.out.println("type of printer connection");//USB or wireless or interface
		String typeOfConnection=scan.next();
		System.out.println("type of printer ");//Inkjet printing,laser, line,thermal,3D, digital
		scan.nextLine();
		String type=scan.nextLine();
		System.out.println("speed of printing per page in minutes");
		float speed=scan.nextFloat();
		System.out.println("size of the printer");//small, medium, large, mini
		String size=scan.next();
		System.out.println("type of print of color");//black and white,color,3d
		String typeOfPrint=scan.next();
		System.out.println("type of paper used");//A4, A3, A6
		String typeOfPaper=scan.next();
		System.out.println("quality of print");//good, bad
		String qualityOfPrint=scan.next();
		//Initializing an object
		Printer p1=new Printer( brand, color, price, typeOfConnection, type, speed, size, typeOfPrint, typeOfPaper,qualityOfPrint);
		System.out.println(p1.brand+" "+p1.color+" "+p1.price+" "+p1.typeOfConnection+" "+p1.type+" "+p1.speed+" "+p1.size+" "+p1.typeOfPrint+" "+p1.typeOfPaper+" "+p1.qualityOfPrint);
		System.out.println("=======================================================================================================================");
		p1.scanning();
		System.out.println("=======================================================================================================================");  
		p1.printing();
		scan.close();
		
	}
}
