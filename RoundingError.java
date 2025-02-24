/*
Sean S
02/23/2025
ICS4UE 
Unit 1: Data Types
Activity 1: Numeric Data Types
RoundingError

Variable dictionary:
    num - stores the int input of user
    squaroot - double, the calculated square root of the number
    square - double, the square of the square root
    error - double, the round off error

*/
import java.util.Scanner;  // Import the Scanner class


class RoundingError {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Rounding Error calculator");
        System.out.println("---------------------------------");
        System.out.println("Please enter a number: ");
        int num = myObj.nextInt();  
        double squaroot = Math.sqrt(num); //the square root of the number
        double square = Math.pow(squaroot,2); //the square of the square root
        double error = num - square; //the round of error calculated from difference

        System.out.println("The round of error is: " + error);

    }
}
