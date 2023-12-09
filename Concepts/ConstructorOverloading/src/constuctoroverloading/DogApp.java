package constuctoroverloading;



public class DogApp {
public static void main(String[] args) {
	// initializing the objects
	Dog d1=new Dog();
	d1.sleep();
	d1.bark();
	System.out.println("===================================================");
	Dog d2=new Dog(4);
	d2.sleep();
	d2.bark();
	System.out.println("===================================================");
	Dog d3=new Dog("Googly", "German Shepard");
	d3.sleep();
	d3.bark();
	System.out.println("===================================================");
	Dog d4=new Dog("Poodle", 1, 20000);
	d4.bark();
	d4.sleep();
	System.out.println("===================================================");
	Dog d5=new Dog("Browny", "Beagle", 2);
	d5.sleep();
	d5.bark();
	System.out.println("===================================================");
	Dog d6=new Dog("Sandy", "Husky", 1, 30000);
	d6.sleep();
	d6.bark();
	
	
}
}
