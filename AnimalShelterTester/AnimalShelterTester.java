/*
Sean S
05/11/2025
ICS4UE 
Unit 6: Introduction to Object-Oriented Programming
Activity 3: Composition
AnimalShelterTester

Variable dictionary:
    shelter – an AnimalShelter object that manages the dog shelter
    scanner – a Scanner object used to receive user input from the console
    myInput – a String storing the user's menu choice
    name – a String storing the name input for a new dog
    breed – a String storing the breed input for a new dog
*/
package AnimalShelterTester;

import java.util.Scanner;

import javax.swing.*;


public class AnimalShelterTester {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();
        Scanner scanner = new Scanner(System.in);
        String myInput = "";
        while(!myInput.equals("5")) {
            System.out.println("Please choose from the following menu:");
            System.out.println("1 - Display list of dogs");
            System.out.println("2 - Add a dog to the shelter");
            System.out.println("3 - Remove a dog from the shelter");
            System.out.println("4 - Display the operating cost of the shelter");
            System.out.println("5 - Exit the program");
            System.out.print("Your choice: ");
            myInput = scanner.nextLine();
            if(myInput.equals("1")) {
                System.out.println(shelter);
            }
            else if(myInput.equals("2")) {
                System.out.print("Please enter a name: ");
                String name = scanner.nextLine();
                System.out.print("Please enter a breed: ");
                String breed = scanner.nextLine();
                shelter.addADog(name, breed);
            }
            else if(myInput.equals("3")) {
                shelter.removeADog();
            }
            else if(myInput.equals("4")) {
                shelter.countCost();
            }
            else {
                System.out.println("Please input a valid number from 1-5");
            }
        }
    }
}
