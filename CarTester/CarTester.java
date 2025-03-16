/*
Sean S
03/16/2025
ICS4UE 
Unit 2: Arrays
Unit 3: Modular Programming
Activity 1: Creating Modules
CarTester

The purpose of this code is to create three different cars, each using a different constructor, 
properties specified by the user.

Variable dictionary:
    make: String variable that stores the make of the car.
    model: String variable that stores the model of the car.
    colour: String variable that stores the color of the car.
    year: Integer variable that stores the manufacturing year of the car.
    price: Integer variable that stores the price of the car.
    horsepower: Integer variable that stores the horsepower of the car.
    myObj: Scanner object used to capture user input.
    car1: Object of the Car class created using the default constructor.
    car2: Object of the Car class created using the constructor that takes all six properties.
    car3: Object of the Car class created using the constructor that takes only the make, model, and colour properties.
    
*/
package CarTester;
    
import java.util.Scanner;  // Import the Scanner class

class CarTester {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    // Ask the user for car properties and store the responses
    System.out.println("Let's create your dream car");
    System.out.println("What is your desired make?");
    String make = myObj.nextLine();
    System.out.println("What is your desired model?");
    String model = myObj.nextLine();
    System.out.println("What is your desired colour?");
    String colour = myObj.nextLine();
    System.out.println("What is your desired year?");
    int year = myObj.nextInt();
    System.out.println("What is your desired price?");
    int price = myObj.nextInt();
    System.out.println("What is your desired horsepower?");
    int horsepower = myObj.nextInt();
    
    car car1 = new car(); //default car constructor
    car car2 = new car(make, model, colour, year, price, horsepower); // Constructor with all properties
    car car3 = new car(make, model, colour); // Constructor with make, model, and colour only

    //Print the details of each car
    System.out.println("Here is the default car:");
    System.out.println(car1.toString());
    System.out.println("--------------------------");

    System.out.println("Here is your dream car");
    System.out.println(car2.toString());
    System.out.println("--------------------------");

    System.out.println("Here is your alternate recommended car");
    System.out.println(car3);
    System.out.println("--------------------------");

    //the car honks
    System.out.println("Your dream car honks");
    car1.honk();
  }
}
