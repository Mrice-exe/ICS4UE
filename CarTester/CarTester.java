/*
Sean S
03/15/2025
ICS4UE 
Unit 2: Arrays
Activity 2: One-Dimensional Arrays
CarTester

Variable dictionary:
    nouns - stores the noun Strings into an array
    verbs - stores the verbs strings into an array
    rhymingNouns - stores the nouns that rhyme into an array
    verb1, verb2, verb3 - the first, second, and third randomly chosen verbs for the poem
    rhymingNoun1, rhymingNoun2, rhymingNoun3 - the first, second, and third randomly chosen rhyming nouns for the poem
    randomNum - a random integer used for randomly picking nouns or verbs
    
*/
package CarTester;
    
import java.util.Scanner;  // Import the Scanner class

class CarTester {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Let's create your dream car");
    System.out.println("What is your desired make?");
    String make = myObj.nextline();
    System.out.println("What is your desired model?");
    String model = myObj.nextline();
    System.out.println("What is your desired colour?");
    String colour = myObj.nextline();
    System.out.println("What is your desired year?");
    int year = myObj.nextline();
    System.out.println("What is your desired price?");
    int price = myObj.nextline();
    System.out.println("What is your desired horsepower?");
    int horsepower = myObj.nextline();
    
    car car1 = new car();
    car car2 = new car(make, model, colour, year, price, horsepower);
    car car3 = new car(make, model, colour);

    //Print the details of each car
    System.out.println("Here is the default car:");
    System.out.println(car1.toString());
    System.out.println("--------------------------");

    System.out.println("Here is your dream car")
    System.out.println(car2.toString());
    System.out.println("--------------------------");

    System.out.println("Here is your alternate recommended car");
    System.out.println(car3);
    System.out.println("--------------------------");

    //the car honks
    car.honk();
  }
}
