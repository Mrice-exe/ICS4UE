/*
Sean S
03/16/2025
ICS4UE 
Unit 3: Modular Programming
Activity 1: Creating Modules
MyBankMachine

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
package MyBankMachine;
    
import java.util.Scanner;  // Import the Scanner class

class MyBankMachine {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    int i = 1
    // Ask the user for the balance and bank properties
    System.out.println("Welcome to the ATM");
    System.out.println("What bank are you using?");
    String bank = myObj.nextLine();
    System.out.println("What is your current balance?");
    int balance = myObj.nextInt();
    while (i == 1){
      System.out.println("------------------------------------");
      System.out.println("(1)check your balance");
      System.out.println("(2)deposit");
      System.out.println("(3)withdraw");
      System.out.println("(4)calculate interest");
      System.out.println("(5)exit");
      int response = myObj.nextInt();
      System.out.println("------------------------------------");
      if response == 1{
        ATM display = new display(balance,bank);
      }
      else if response == 2{
        System.out.println("How much would you like to deposit?");
        int deposit = myObj.nextInt();
        ATM dep = new deposit(balance,deposit,bank);
      }
      else if response == 3{
        System.out.println("How much would you like to withdraw?");
        int withdraw = myObj.nextInt();
        ATM wit = new withdraw(balance,withdraw,bank);
      }
      else if response == 4{
        System.out.println("What is the interest rate per compound period for your account? (please respond in integers i.e. '5')");
        int interest = myObj.nextInt();
        System.out.println("How many compound periods do you plan on having?");
        int periods = myObj.nextInt();

        ATM interes = new interest(balance,interest,periods);
      }
      else if response == 5{
        i = 0
        System.out.println("It's been a pleasure at "+bank+" see you next time!")
      }

    }

  }
}
