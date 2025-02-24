/*
Sean S
02/23/2025
ICS4UE 
Unit 1: Data Types
Activity 1: Numeric Data Types
AreaOfTriangle

Variable dictionary:
    num - stores the int input of user
    squaroot - double, the calculated square root of the number
    square - double, the square of the square root
    error - double, the round off error

*/
import java.util.Scanner;  // Import the Scanner class


class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Scalene triangle area calculator");
        System.out.println("---------------------------------");
        System.out.println("Please enter the a value: ");
        int a = myObj.nextInt();  
        System.out.println("Please enter the b value: ");
        int b = myObj.nextInt();  
        System.out.println("Please enter the c value: ");
        int c = myObj.nextInt();  
        //we are using the Heron's formula
        double semi = (a+b+c)/2; //finding the semi-perimeter

        double area = Math.sqrt(semi*(semi-a)*(semi-b)*(semi-c)); //find the area using the Heron's formula

        System.out.println("The area of the triangle is" + area);

    }
}
