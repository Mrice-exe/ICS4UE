/*
Sean S
02/23/2025
ICS4UE 
Unit 2: Data Types
Activity 1: String Data Types
SimpleEncryption

Variable dictionary:
    sentence - stores the String input of user
    phrase - is the sentence without the spaces
    reversed - is the reversed String of the word
*/
import java.util.Scanner;  // Import the Scanner class


class SimpleEncryption {
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
                System.out.println(sentence+" IS a palindrome.");
                
            } 
            else{
                System.out.println(sentence+" is NOT a palindrome.");
            }

    }
}
