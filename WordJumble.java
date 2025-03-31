/*
Sean S
03/30/2025
ICS4UE 
Unit 4: Recursion
Activity 2: More Recursion Algorithms
WordJumble

Variable dictionary:
    letters - stores the set of letters input by the user for jumbling
    word - stores the remaining letters to jumble during each recursive call
    jumbLet - stores the letters already used to form the jumbled word during each recursive call
    pos - loop variable used to iterate over the letters in the input word
    remainingLetters - stores the substring of the word excluding the letter at the current position
    origWord - stores the original word input by the user (for reference in recursion)
    origJumbledLetters - stores the original jumbled letters (for reference in recursion)
*/
import java.util.Scanner;  // Import the Scanner class


class WordJumble {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Every possible word generator");
        System.out.println("---------------------------------");
        System.out.println("Please enter a set of letters to jumble:");
        String letters = myObj.nextLine();  //take in the input
        jumbleWords(letters,"");

    }

    public static void jumbleWords(String word, String jumbLet) {
      /* This function generates every possible combination of letters to form a "word" from a set of letters
      */
      int pos;
      String remainingLetters;
      String origWord = word;
      String origJumbledLetters = jumbLet;
      if (word.length() == 1) {
        System.out.println(jumbLet + word);
      } else {
        for (pos = 0; pos < origWord.length(); pos++) {
          remainingLetters = origWord.substring(0, pos)
            + origWord.substring(pos + 1, origWord.length());
          //recursive call to jumbleWords()
          jumbleWords(remainingLetters, 
            origJumbledLetters + origWord.charAt(pos));
        }
      }
    }
}
