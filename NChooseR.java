/*
Sean S
02/23/2025
ICS4UE 
Unit 4: Recursion
Activity 1: What is Recursion?
NChooseR

Variable dictionary:
    n - stores the desired nth value of the user for fibonacci
    nth - stores the calcualte number from the sequence
*/
import java.util.Scanner;  // Import the Scanner class


class NChooseR {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Total Combinations Calculator");
        System.out.println("---------------------------------");
        System.out.println("Enter the number of objects available");
        int n = myObj.nextInt();  //take in the input
        System.out.println("Enter the number of different objects chosen from the set");
        int r = myObj.nextInt();  //take in the input
        int total = combinations(n); //call the function
        System.out.println("The "+ n + "th fibonacci number is "+nth+"!");

    }
    public static int combinaitons(int n, int r) {
      if (n < 2){
        return n; //if n is 1 or 0 then return n
      }
      else{
        return fib(n-1)+ fib(n-2); //recursively call fib(n-1) and add it with a recursive fib(n-2)
      }
    }
    public static int fact(int x) {
      if (n < 2){
        return n; //if n is 1 or 0 then return n
      }
      else{
        return fib(n-1)+ fib(n-2); //recursively call fib(n-1) and add it with a recursive fib(n-2)
      }
    }
}
