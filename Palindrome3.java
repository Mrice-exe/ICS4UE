/*
Sean S
02/23/2025
ICS4UE 
Unit 2: Data Types
Activity 1: String Data Types
Palindrome3

Variable dictionary:
    sentence - stores the String input of user
    reversed - is the reversed String of the word
    palindromeCount - an int that holds the total amount of palindromes
    pali - a string that contains all of the palidromes
*/
import java.util.Scanner;  // Import the Scanner class


class Palindrome3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter a sentence: ");
        String sentence = myObj.nextLine();  
        sentence = sentence.toLowerCase();// make the word letters all lowercase

        int palindromeCount = 0; // Counter for palindrome words
        String pali = ""; //will hold all of the palindrome words

        String[] words = sentence.split("\\s+"); // Split sentence into words (by spaces)
        //iterate through every word in the sentence
        for (String word : words) {
            String reversed = ""; // Initialize reversed string for each word
            //iterate through each letter starting from the end of the word and create the reversed word
            for (int i = word.length() - 1; i >= 0; i--) {
              reversed += word.charAt(i);
            }
            if (word.equals(reversed)) { //if the reversed is the same as the word
              palindromeCount += 1; //add one to the counter
              pali += word + " "; //add the palidrome into the palidrome word storage
            } 
        }
        System.out.println("There are "+palindromeCount+" palidromes in the sentence");
        System.out.println("The palindromes are: "+pali);

    }
}
