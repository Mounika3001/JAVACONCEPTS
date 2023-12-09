package constructors;

public class Pg {
	//attributes or data members
	String name;
	short room;
	short rent;
	String food;
	String washingMachineType;
	byte sharing;
	boolean isGeaser;
	byte floors;
	boolean isLift;
	byte fan;
	String location;
	// initializing the constructor
	public Pg(String name, short room, short rent, String food, String washingMachineType, byte sharing,
			boolean isGeaser, byte floors, boolean isLift, byte fan,String location) {
		super();
		this.name = name;
		this.room = room;
		this.rent = rent;
		this.food = food;
		this.washingMachineType = washingMachineType;
		this.sharing = sharing;
		this.isGeaser = isGeaser;
		this.floors = floors;
		this.isLift = isLift;
		this.fan = fan;
		this.location=location;
	}
	//behaviors or  member functions
	void runningPg()
	{
		System.out.println(name+" pg is running in"+location+" which costs  "+rent+" per month");
	}
	void sharingRoom()
	{
		System.out.println(name+" pg consists of 3 diferent types types of sharing in that most of them chose "+sharing+" sharing");
	}
	

}
