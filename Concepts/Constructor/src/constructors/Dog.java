package constructors;

public class Dog {
	//data members
String name;
String breed;
int age;
//member functions
void eat()
{
	System.out.println(name+" dog is eating ");
}
void bark()
{
	System.out.println("Angry "+name+" dog whose age is"+age+" is barking");
}
//Initializing a constructor
public Dog(String name, String breed, int age) {
	super();
	this.name = name;
	this.breed = breed;
	this.age = age;
}


}
