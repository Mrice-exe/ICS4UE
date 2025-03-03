/*
Sean S
03/02/2025
ICS4UE 
Unit 2: Arrays
Activity 2: One-Dimensional Arrays
Eratosthenes

Variable dictionary:
    numbers - an array that holds all numbers with a True or False (prime or not prime)
    limit - the highest number to go to from 1 - limit
    
*/
import java.util.ArrayList;  // Import the ArrayList class

class Eratosthenes {
    public static void main(String[] args) {
        int limit = 1000;  // Define the limit
        boolean numbers[] = new boolean[limit + 1]; // Array to track prime numbers

        // Initialize all numbers as prime (true)
        for (int i = 2; i <= limit; i++) {
            numbers[i] = true;
        }

        // Eratosthenes' Sieve algorithm
        for (int i = 2; i * i <= limit; i++) {
            if (numbers[i]) {  // If the number is still true, it's prime
                // Mark multiples of i as false (not prime)
                for (int j = i * i; j <= limit; j += i) {
                    numbers[j] = false;
                }
            }
        }

        // Print the prime numbers
        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (numbers[i]) {
                System.out.print(i + " ");
            }
        }
  }
}
