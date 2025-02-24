/*
Sean S
02/23/2025
ICS4UE 
Unit 2: Data Types
Activity 1: String Data Types
Palindrome

Variable dictionary:
    word - stores the String input of user
    reversed - is the reversed String of the word

*/
import java.util.Scanner;  // Import the Scanner class


class Palindrome {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter a word: ");
        int word = myObj.nextInt();  
        word = word.toLowerCase();// make the word letters all lowercase
        String resversed;
        //iterate through each letter starting from the end of the word and create the reversed word
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        System.out.println(word + " in reverse is "+reversed)
        if (word.equals(reversed)) { //if the reversed is the same as the word
            System.out.println("The word is a palindrome."); //then it is a palindrome
        } 
        else { //if they're not the same
            System.out.println("The word is NOT a palindrome."); //it is not a palindrome

    }
}
