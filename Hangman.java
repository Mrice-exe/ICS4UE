/*
Sean S
03/02/2025
ICS4UE 
Unit 2: Arrays
Activity 2: Two-Dimensional Arrays
Hangman

Variable dictionary:
    categories - an array of strings that holds the names of different categories for the Hangman game .
    words - a two-dimensional array that holds words/phrases corresponding to each category. 
    categoryIndex - an integer that stores the index of the randomly chosen category.
    category - a string that stores the name of the randomly selected category.
    wordList - an array of strings that contains words/phrases from the selected category.
    word - a string that stores the randomly chosen word/phrase from the selected category (in uppercase).
    currentGuess - a character array that stores the current state of the word (with dashes representing unguessed letters).
    hangmanParts - an array of strings representing the different stages of the hangman image, which is displayed after incorrect guesses.
    incorrectGuesses - an integer that keeps track of the number of incorrect guesses made by the player.
    maxIncorrectGuesses - an integer representing the maximum number of incorrect guesses allowed (7 in this case).
    wordGuessed - a boolean that indicates whether the entire word has been correctly guessed.
    guess - a character that stores the letter guessed by the player.
    correctGuess - a boolean that indicates if the guessed letter is part of the word.
    scanner - a Scanner object used to take input from the user.
    
*/
import java.util.ArrayList;  // Import the ArrayList class
import java.util.Scanner;  // Import the Scanner class
import java.util.Random; // Import the Random class


public class Hangman {

    // Array of categories with words/phrases
    private static final String[] categories = {"Animals", "Famous People", "Movies"};
    
    private static final String[][] words = {
        {"cat", "dog", "elephant", "lion", "giraffe"},    // Animals
        {"Einstein", "Shakespeare", "Darwin", "Newton", "Tesla"},  // Famous People
        {"Inception", "Titanic", "Matrix", "Avatar", "Gladiator"}  // Movies
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Randomly choose a category
        int categoryIndex = random.nextInt(categories.length);
        String category = categories[categoryIndex];
        String[] wordList = words[categoryIndex];
        
        // Randomly choose a word/phrase from the selected category
        String word = wordList[random.nextInt(wordList.length)].toUpperCase();
        
        // Array to store current guesses (represented by dashes initially)
        char[] currentGuess = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            currentGuess[i] = '-';
        }

        // Hangman parts (for illustration)
        String[] hangmanParts = {
            "   -----\n   |   |\n       |\n       |\n       |\n       |\n  ========",
            "   -----\n   |   |\n   O   |\n       |\n       |\n       |\n  ========",
            "   -----\n   |   |\n   O   |\n   |   |\n       |\n       |\n  ========",
            "   -----\n   |   |\n   O   |\n  /|   |\n       |\n       |\n  ========",
            "   -----\n   |   |\n   O   |\n  /|\\  |\n       |\n       |\n  ========",
            "   -----\n   |   |\n   O   |\n  /|\\  |\n  /    |\n       |\n  ========",
            "   -----\n   |   |\n   O   |\n  /|\\  |\n  / \\  |\n       |\n  ========"
        };

        // Number of incorrect guesses allowed
        int incorrectGuesses = 0;
        int maxIncorrectGuesses = 7;
        boolean wordGuessed = false;
        
        System.out.println("Welcome to Hangman!");
        System.out.println("Category: " + category);
        
        // Game loop
        while (incorrectGuesses < maxIncorrectGuesses && !wordGuessed) {
            System.out.println("\nCurrent word: " + new String(currentGuess));
            System.out.println(hangmanParts[incorrectGuesses]); // Display hangman image

            System.out.print("\nGuess a letter: ");
            char guess = Character.toUpperCase(scanner.next().charAt(0));

            // Check if the guess is correct
            boolean correctGuess = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    currentGuess[i] = guess;
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                incorrectGuesses++;
                System.out.println("Incorrect guess! There are "+ (maxIncorrectGuesses - incorrectGuesses) + " guesses left!");
            } else {
                System.out.println("Good guess!");
            }

            // Check if the word is fully guessed
            wordGuessed = true;
            for (int i = 0; i < word.length(); i++) {
                if (currentGuess[i] == '-') {
                    wordGuessed = false;
                    break;
                }
            }
        }

        // End of game result
        if (wordGuessed) {
            System.out.println("\nCongratulations! You've guessed the word: " + word);
        } else {
            System.out.println("\nSorry, you've been hanged! The word was: " + word);
            System.out.println(hangmanParts[maxIncorrectGuesses - 1]); // Display final hangman image
        }
    }
}
