/*
Sean S
02/23/2025
ICS4UE 
Unit 2: Data Types
Activity 1: String Data Types
SimpleEncryption

Variable dictionary:
    phrase - stores the String input of user
    rotation - stores the int desired rotation
    enOrDie - stores the int value of 1 or 2 from the user input deciding encryption or decryption
    encrypted - the string that holds the encrypted phrase
    decrypted - the string that holds the decrypted phrase
    current - the current character the for loop is on
    base - the uppercase A which has a specified ascii value
    newchar - is the new character after the rotation calculated from a formula
    
*/
import java.util.Scanner;  // Import the Scanner class


class SimpleEncryption {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter a phrase: ");
        String phrase = myObj.nextLine();  
        System.out.println("Please enter the rotation amount (1-25): ");
        int rotation = myObj.nextInt();  
        System.out.println("(1)Encryption  (2)Decryption   Pick one: ");
        int enOrDe = myObj.nextInt();  
        phrase = phrase.toUpperCase();// make the word letters all uppercase

        String encrypted = "";
        String decrypted = "";
        if (enOrDe == 1) { //if the user chose encryption
            for (int i = 0; i < phrase.length(); i++) { //iterate through all characters
                char current = phrase.charAt(i);
                if (Character.isLetter(current)) {
                    char base = 'A';
                    // Shift the letter by the rotation amount
                    char newChar = (char) ((current - base + rotation) % 26 + base);
                    encrypted += newChar;
                } else {
                    encrypted += current; // Keep spaces and non-letters unchanged
                }
            }
            System.out.println("The original phrase is: " + phrase);
            System.out.println("The encrypted phrase is: " + encrypted);

        } 
        else{ //if the user chose decryption
            for (int i = 0; i < phrase.length(); i++) { //iterate through all characters
                char current = phrase.charAt(i);
                if (Character.isLetter(current)) {
                    char base = 'A';
                    // Shift the letter by the rotation amount
                    char newChar = (char) ((current - base - rotation+26) % 26 + base);
                    decrypted += newChar;
                } 
                else {
                    decrypted += current; // Keep spaces and non-letters unchanged
                }
            }
            System.out.println("The original phrase is: " + phrase);
            System.out.println("The decrypted phrase is: " + decrypted);
        }

    }
}
