package nestedconditionalconstructs;

import java.util.Scanner;

public class NestedSwitch {
public static void main(String[] args) {
	
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to Our Restaurant!");
	        System.out.println("1. Breakfast");
	        System.out.println("2. Lunch");
	        System.out.println("3. Dinner");

	        System.out.print("Enter your choice: ");
	        int menuChoice = scanner.nextInt();

	        switch (menuChoice) {
	            case 1:
	                System.out.println("You selected Breakfast.");
	                System.out.println("1. Pancakes");
	                System.out.println("2. Omelette");
	                System.out.print("Enter your breakfast choice: ");
	                int breakfastChoice = scanner.nextInt();

	                switch (breakfastChoice) {
	                    case 1:
	                        System.out.println("Enjoy your Pancakes!");
	                        break;
	                    case 2:
	                        System.out.println("Great choice! Omelette is on its way.");
	                        break;
	                    default:
	                        System.out.println("Invalid breakfast choice.");
	                }
	                break;

	            case 2:
	                System.out.println("You selected Lunch.");
	                // Add lunch menu options and nested switch if needed
	                break;

	            case 3:
	                System.out.println("You selected Dinner.");
	                // Add dinner menu options and nested switch if needed
	                break;

	            default:
	                System.out.println("Invalid menu choice. Please try again.");
	        }

	        scanner.close();
	    }
	
}

