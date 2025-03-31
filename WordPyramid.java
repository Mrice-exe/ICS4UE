/*
Sean S
03/30/2025
ICS4UE 
Unit 4: Recursion
Activity 2: More Recursion Algorithms
WordPyramid

Variable dictionary:
    word - stores the word that the user entered
    pyramidWord - the word without the first and last letter
*/
import java.util.Scanner;  // Import the Scanner class


class WordPyramid {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Word Pyramid Generator!");
        System.out.println("---------------------------------");
        System.out.println("Please enter a word:");
        String word = myObj.nextLine();  //take in the input
        pyramid(word);

    }

    public static void pyramid(String word) {
      /* This function keeps removing the first and last letter of a word until only the middle is left*/
      if (word.length() <3) {
        System.out.println(word); //when word only has 2 or 1 letter we are done
      } else {
        System.out.println(word); //print out the word
        String pyramidWord = word.substring(1, word.length() - 1); //removes the first and last letters
        pyramid(pyramidWord); //recursive call
  
        }
      }
    }
