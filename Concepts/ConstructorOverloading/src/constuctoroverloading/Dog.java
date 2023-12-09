package constuctoroverloading;

public class Dog {
	//data members
String name;
String breed;
int  age;
int price;
//constructor overloading
public Dog()
{
	name="Goldy";
	breed="Lab";
	age=5;
	price=10000;
}
public Dog(int a) {
	
	price = a;
	name="swiss";
	age=2;
	breed="Bull dog";
	
}

public Dog(String a, int b, int c) {
	
	name = a;
	age = b;
   price = c;
   breed="Hutch";
}

public Dog(String a, String b, int c) {
	
	name = a;
	breed = b;
	age = c;
	price=10000;
}

public Dog(String a, String b) {
	
	name = a;
	breed = b;
	age=5;
	price=15000;
}

public Dog(String a, String b, int c, int d) {
	
	name = a;
	breed = b;
	age = c;
	price = d;
}
//member functions
void sleep()
{
	System.out.println(name+" dog is sleeping");
}
void bark()
{
	System.out.println("The angry "+name+" whose age is "+age+ " of breed "+breed+" is barking");
}
}
