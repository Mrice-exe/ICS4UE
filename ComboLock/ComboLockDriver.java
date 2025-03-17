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
