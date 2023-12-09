package constructors;

import java.util.Scanner;

public class PgApp {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
	
		System.out.println("enter pg name");
		String name=scan.nextLine();
		System.out.println("enter pg room number");
		short room=scan.nextShort();
		System.out.println("enter pg rent");
		short rent=scan.nextShort();
		System.out.println("food name");
		String food=scan.next();
		System.out.println("washing machine type");
		scan.nextLine();
		String washingMachineType=scan.nextLine();
		System.out.println("Number of persons sharing");
		byte sharing=scan.nextByte();
		System.out.println("is geaser present");
		boolean isGeaser=scan.nextBoolean();
		System.out.println("enter number of floors");
		byte floors=scan.nextByte();
		System.out.println("is Lift present");
		boolean isLift=scan.nextBoolean();
		System.out.println("Number of fans ");
		byte fan=scan.nextByte();
		System.out.println("Location Name");
		String location=scan.nextLine();
		//initializing an object;
		Pg pg1=new Pg(name, room, rent, food, washingMachineType, sharing, isGeaser, floors, isLift, fan, location);
	    System.out.println(pg1.name+" "+pg1.room+" "+pg1.rent+" "+pg1.food+" "+pg1.washingMachineType+" "+pg1.sharing+" "+pg1.isGeaser+" "+pg1.floors+" "+pg1.isLift+" "+pg1.fan+" "+pg1.location);
	    System.out.println("=======================================================================================");
	    pg1.runningPg();
	    System.out.println("=======================================================================================");
	    pg1.sharingRoom();
	    scan.close();
		}
}
