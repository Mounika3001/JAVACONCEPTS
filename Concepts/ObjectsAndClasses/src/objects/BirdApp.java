package objects;

import java.util.Scanner;

public class BirdApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Bird b=new Bird();
	System.out.println("Enter the name of the bird");
	b.name=scan.next();
	System.out.println("Enter the food habitat of bird");
	b.foodHabit=scan.next();
	System.out.println("Enter the age of the bird");
	b.age=scan.nextInt();
	System.out.println("==================================");
	b.eat();
	System.out.println("==================================");
	b.fly();
	scan.close();
}
}
