/*
Sean S
02/23/2025
ICS4UE 
Unit 1: Data Types
Activity 1: Numeric Data Types
EasterVariation2

Variable dictionary:
    t - turtle.turtle(), makes for coding lines and using the turtle object functions a lot
        easier.
*/
import java.util.Scanner;  // Import the Scanner class


class EasterVariation2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Easter month and day finder");
        System.out.println("---------------------------------");
        System.out.println("Enter the year: ");
        int year = myObj.nextInt();  
        int a = year/100; //quotient of year/100
        int b = year%100; //remainder of year/100
        int c = 3*(a+25) / 4; // quoteint of 3 * (a + 25) divided by 4
        int d = 3 * (a + 25) %4; //remainder of 3 * (a + 25) divided by 4
        int q = 8 * (a + 11) /25 % 25; //quotient of 8*(a+11) divided by 25
        int f = (5*a+b) %19; // remainder of 5a+b divided by 19
        int g = (19*f + c -q) % 30; //remainder of 19f + c -q divided by 30
        int h = (f+11*g)/319; //quotient of f + 11g divided by 319
        int j = (60 * (5 - d) + b) / 4; //quotient of 60 * (5 - d) + b divided by 4
        int k = (60 * (5 - d) + b) %4; //remainder of 60 * (5 - d) + b divided by 4
        int n = (2*j - k - g + h) %7; // remainder of 2j - k - g + h divided by 7
        int month = (g - h + n + 114)/31; // the month is the quotient of g - h + n + 114 divided by 31
        int p = (g - h + n + 114) % 31; //remainder of g - h + n + 114 divided by 31
        int day = p+1; //the day is p+1
        System.out.println("Easter during the year " + year + " is on the " + day + " day of the " + month + " month.");

    }
}
