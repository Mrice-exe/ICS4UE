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


        String phrase = sentence.replace(" ",""); //remove all of the spaces

        String reversed = ""; // Initialize reversed string for each word
        //iterate through each letter starting from the end of the phrase and create the reversed phrase
            for (int i = phrase.length() - 1; i >= 0; i--) {
              reversed += phrase.charAt(i);
            }
            if (phrase.equals(reversed)) { //if the reversed is the same as the word
                System.out.println(phrase+" IS a palindrome.");
            } 
            else{
                System.out.println(phrase+" is NOT a palindrome.");
            }

    }
}
