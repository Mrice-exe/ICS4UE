/*
Sean S
02/23/2025
ICS4UE 
Unit 1: Data Types
Activity 1: Numeric Data Types
RoundingError

Variable dictionary:
    month - stores the month as int

*/
import java.util.Scanner;  // Import the Scanner class


class EasterVariation2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Rounding Error calculator");
        System.out.println("---------------------------------");
        System.out.println("Please enter a number: ");
        int num = myObj.nextInt();  
        int squaroot = Math.sqrt(num); //the square root of the number
        int square = Math.expo(squaroot); //the square of the square root
        int error = num - square;

        System.out.println("The round of error is: " + error);

    }
}
