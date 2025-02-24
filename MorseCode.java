/*
Sean S
02/23/2025
ICS4UE 
Unit 2: Data Types
Activity 1: String Data Types
MorseCode

Variable dictionary:
    phrase - stores the String input of user
    current - the current character the for loop is at
    index - the corresponding index of the character
    
*/
import java.util.Scanner;  // Import the Scanner class


class MorseCode {
    public static void main(String[] args) {

        // Morse code conversion table
        String[] morseCode = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",  // A-Z
            ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"  // 1-0
        };

        // Create a mapping for the alphabet and digits
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
      
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter a phrase: ");
        String phrase = myObj.nextLine();  

        phrase = phrase.toUpperCase(); //make all characters uppercase


          for (int i = 0; i < phrase.length(); i++) { //iterate through all characters
              char current = phrase.charAt(i);
              //get the corresponding index of the character.
              int index = alphabet.indexOf(current);

              System.out.println(morseCode[index]); //output the morse code of the character as we go

        }

    }
}
