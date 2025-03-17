/*
Sean S
03/16/2025
ICS4UE 
Unit 3: Modular Programming
Activity 2: Modifying Modules
ComboLockDriver

The purpose of this code is to imitate cracking open a combination for a lock

Variable dictionary:
    scanner: A Scanner object used to capture user input from the console.
    num1, num2, num3: Integer variables that store the user's input when setting the combination for the lock.
    lock: An object of the ComboLock class, used to create and manage a lock with a combination provided by the user.
    randomLock: An object of the ComboLock class, used to create a lock with a random combination that the user attempts to guess.
*/
import java.util.Scanner;

public class ComboLockDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate a ComboLock object
        ComboLock lock = new ComboLock();

        // Set the combination by prompting the user for three numbers
        System.out.println("Enter a combination for your lock:");
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Set the combination
        lock.setCombination(num1, num2, num3);

        // Simulate the user trying to open the lock by asking for each number
        lock.openLock();

        // Instantiate a new lock object with a random combination
        ComboLock randomLock = new ComboLock();
        randomLock.randomCombination();

        // Simulate the user guessing the random combination
        randomLock.randomLockGuess();
    }
}
