import java.util.Scanner;
import java.util.Random;

public class ComboLock {
    private int[] combination = new int[3];  // Stores the lock combination
    private int[] userCombination = new int[3]; // Stores the user's attempt

    // Constructor that sets the combination with user input
    public void setCombination(int num1, int num2, int num3) {
        combination[0] = num1;
        combination[1] = num2;
        combination[2] = num3;
    }

    // Constructor that generates a random combination with numbers 1-3
    public void randomCombination() {
        Random rand = new Random();
        combination[0] = rand.nextInt(3) + 1;  // Random number between 1 and 3
        combination[1] = rand.nextInt(3) + 1;  // Random number between 1 and 3
        combination[2] = rand.nextInt(3) + 1;  // Random number between 1 and 3
    }

    // Method to check if the user's input matches the combination
    public boolean checkCombination(int[] userInput) {
        for (int i = 0; i < 3; i++) {
            if (userInput[i] != combination[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to prompt user for input and attempt to open the lock
    public void openLock() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 3 combination numbers to open the lock:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            userCombination[i] = scanner.nextInt();
        }

        if (checkCombination(userCombination)) {
            System.out.println("Success! The lock is opened.");
        } else {
            System.out.println("Incorrect combination. The lock remains closed.");
        }
    }

    // Method to simulate the random lock scenario with 3 incorrect guesses
    public void randomLockGuess() {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        while (attempts < 3) {
            System.out.println("Guess the combination (Attempt " + (attempts + 1) + "/3):");
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter number " + (i + 1) + ":");
                userCombination[i] = scanner.nextInt();
            }

            if (checkCombination(userCombination)) {
                System.out.println("Success! You guessed the combination correctly!");
                return;
            } else {
                System.out.println("Incorrect combination. Try again.");
            }
            attempts++;
        }

        System.out.println("You have failed to guess the combination in 3 attempts.");
        System.out.println("The correct combination is: " + combination[0] + ", " + combination[1] + ", " + combination[2]);
    }
}
