/*
Sean S
03/16/2025
ICS4UE 
Unit 3: Modular Programming
Activity 2: Modifying Modules
TwoDogsMeet

The purpose of this code is to create three different cars, each using a different constructor, 
properties specified by the user.

Variable dictionary:
    scanner: Scanner object used to capture user input.
    name1, name2: String variables to store the names of the first and second dogs.
    breed1, breed2: String variables to store the breeds of the first and second dogs.
    dog1, dog2: Dog objects representing the two dogs created.
    changeAggression1, changeAggression2: Integer variables that store the user's choice to change the aggression values for the first and second dogs.
    changeHunger1, changeHunger2: Integer variables that store the user's choice to change the hunger values for the first and second dogs.
    newAggression1, newAggression2: Integer variables used to store the new aggression values for the first and second dogs.
    newHunger1, newHunger2: Integer variables used to store the new hunger values for the first and second dogs.
    meetingResult: String variable used to store the result of the dogs' meeting.
    
*/
package TwoDogsMeet;
    
import java.util.Scanner;  // Import the Scanner class

public class TwoDogsMeet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Output message that two dogs will be created
        System.out.println("Two dogs will be created!");

        // Prompt user for the name and breed of the first dog
        System.out.print("Enter the name of the first dog: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter the breed of the first dog: ");
        String breed1 = scanner.nextLine();
        
        // Prompt user for the name and breed of the second dog
        System.out.print("Enter the name of the second dog: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter the breed of the second dog: ");
        String breed2 = scanner.nextLine();

        // Create two dog objects with random properties
        Dog dog1 = new Dog(name1, breed1);
        Dog dog2 = new Dog(name2, breed2);

        // Output the information of each dog
        System.out.println("\nHere is the first dog:");
        System.out.println(dog1.toString());
        System.out.println("\nHere is the second dog:");
        System.out.println(dog2.toString());

        // Ask the user if they want to change the aggression for the first dog
        System.out.print("\nDo you want to change the aggression of " + name1 + "? (1 for yes, 0 for no): ");
        int changeAggression1 = scanner.nextInt();
        if (changeAggression1 == 1) {
            System.out.print("Enter new aggression value for " + name1 + ": ");
            int newAggression1 = scanner.nextInt();
            dog1.setAggression(newAggression1);
        }

        // Ask the user if they want to change the hunger for the first dog
        System.out.print("\nDo you want to change the hunger of " + name1 + "? (1 for yes, 0 for no): ");
        int changeHunger1 = scanner.nextInt();
        if (changeHunger1 == 1) {
            System.out.print("Enter new hunger value for " + name1 + ": ");
            int newHunger1 = scanner.nextInt();
            dog1.setHunger(newHunger1);
        }

        // Ask the user if they want to change the aggression for the second dog
        System.out.print("\nDo you want to change the aggression of " + name2 + "? (1 for yes, 0 for no): ");
        int changeAggression2 = scanner.nextInt();
        if (changeAggression2 == 1) {
            System.out.print("Enter new aggression value for " + name2 + ": ");
            int newAggression2 = scanner.nextInt();
            dog2.setAggression(newAggression2);
        }

        // Ask the user if they want to change the hunger for the second dog
        System.out.print("\nDo you want to change the hunger of " + name2 + "? (1 for yes, 0 for no): ");
        int changeHunger2 = scanner.nextInt();
        if (changeHunger2 == 1) {
            System.out.print("Enter new hunger value for " + name2 + ": ");
            int newHunger2 = scanner.nextInt();
            dog2.setHunger(newHunger2);
        }

        // Simulate the meeting between the two dogs and output the result
        System.out.println("\nNow the dogs will meet...");
        String meetingResult = dog1.meet(dog2);
        System.out.println(meetingResult);
    }
}
