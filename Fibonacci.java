/*
Sean S
02/23/2025
ICS4UE 
Unit 4: Recursion
Activity 1: What is Recursion?
Fibonacci

Variable dictionary:
    n - stores the desired nth value of the user for fibonacci
    nth - stores the calcualte number from the sequence
*/
import java.util.Scanner;  // Import the Scanner class


class Fibonacci {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Fibonacci calculator");
        System.out.println("---------------------------------");
        System.out.println("The first nine fibonacci numbers are: 1, 1, 2, 3, 5, 8, 13, 21, 34");
        System.out.println("Enter the value of n (the nth fibonacci number): ");
        int n = myObj.nextInt();  //take in the input
        int nth = fib(n); //call the function
        System.out.println("The "+ n + "th fibonacci number is "+nth+"!");

    }
    public static int fib(int n) {
      if (n < 2){
        return n; //if n is 1 or 0 then return n
      }
      else{
        return fib(n-1)+ fib(n-2); //recursively call fib(n-1) and add it with a recursive fib(n-2)
      }
    }
}
