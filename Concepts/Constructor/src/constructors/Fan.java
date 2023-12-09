package constructors;

public class Fan {
	//data members
String brand;
String color;
int cost;
//member functions
void blowsAir()
{
	System.out.println(brand+" fan is blowing air");
}
void rotate()
{
	System.out.println(brand+" "+color+" fan is rotating");
}
//initializing the constructor
public Fan(String a, String b, int c)
{
	brand =a;
	color= b;
	cost=c;
}
}
