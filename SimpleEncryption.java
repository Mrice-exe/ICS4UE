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
        System.out.println("Please enter a phrase: ");
        String phrase = myObj.nextLine();  
        System.out.println("Please enter the rotation amount (1-25): ");
        Int rotation = myObj.nextInt();  
        System.out.println("(1)Encryption  (2)Decryption   Pick one: ");
        Int enOrDe = myObj.nextInt();  
        phrase = phrase.toUpperCase();// make the word letters all uppercase

        String encrypted = "";
        if (enOrDe == 1 { //if the user chose encryption
            for (int i = 0; i < phrase.length(); i++) {
                char current = phrase.charAt(i);
                if (Character.isLetter(currentChar)) {
                    char base = 'A'
                    // Shift the letter by the rotation amount
                    char newChar = (char) ((current - base + rotation) % 26 + base);
                    encrypted += newChar;
                } 
                else {
                    encrypted += current // Keep spaces and non-letters unchanged
                }
            }
            System.out.println("The original phrase is: " + phrase);
            System.out.println("The encrypted phrase is: " + encrypted);

        } 
        else{ //if the user chose decryption
            System.out.println(sentence+" is NOT a palindrome.");
        }

    }
}
