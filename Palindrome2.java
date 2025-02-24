/*
Sean S
02/23/2025
ICS4UE 
Unit 2: Data Types
Activity 1: String Data Types
Palindrome2

Variable dictionary:
    sentence - stores the String input of user
    reversed - is the reversed String of the word

*/
import java.util.Scanner;  // Import the Scanner class


class Palindrome2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter a sentence: ");
        String sentence = myObj.nextLine();  
        sentence = sentence.toLowerCase();// make the word letters all lowercase

        int palindromeCount = 0; // Counter for palindrome words
        String pali = "";

        String[] words = sentence.split("\\s+"); // Split sentence into words (by spaces)
        //iterate through each letter starting from the end of the word and create the reversed word
        for (String word : words) {
            String reversed = ""; // Initialize reversed string for each word
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
