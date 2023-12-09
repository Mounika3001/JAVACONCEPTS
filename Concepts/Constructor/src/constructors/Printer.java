package constructors;

public class Printer {
	// data members 
	String brand;
	String color;
	int price;
	String typeOfConnection;
	String type;
	float speed;
	String size;
	String typeOfPrint;
	String typeOfPaper;
	String qualityOfPrint;
	//members functions
	void scanning()
	{
		System.out.println(brand+" printer which costs "+price+" scanning the input from the document which is of "+typeOfConnection+" connection");
	}
	//constructor
	public Printer( String brand, String color, int price, String typeOfConnection, String type,
			float speed, String size, String typeOfPrint , String typeOfPaper, String qualityOfPrint) {
		super();
		
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.typeOfConnection = typeOfConnection;
		this.type = type;
		this.speed = speed;
		this.size = size;
		this.typeOfPrint = typeOfPrint;
		this.typeOfPaper = typeOfPaper;
		this. qualityOfPrint = qualityOfPrint;;
	}
	void printing()
	{
		System.out.println(color+" colored "+brand+" printer is printing "+typeOfPrint+" type of print " );
	}
	

}
