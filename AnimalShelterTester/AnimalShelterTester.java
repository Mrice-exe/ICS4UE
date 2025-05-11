package AnimalShelterTester;

import java.util.Scanner;

import javax.swing.*;


public class AnimalShelterTester {
    public static void main(String[] args) {
        String myInput = "";
        while(!myInput.equals("5")) {
            myInput = JOptionPane.showInputDialog(
                "Please choose from the following menu:\n" +
                "1 – Display list of dogs\n" +
                "2 - Add a dog to the shelter\n" +
                "3 - Remove a dog from the shelter\n" +
                "4 - Display the operating cost of the shelter\n" +
                "5 - Exit the program");
            if(myInput.equals("1")) {
                //Display the list of dogs
            }
            else if(myInput.equals("2")) {
                //Add a dog object
            }
            else if(myInput.equals("3")) {
                //Remove a dog object
            }
            else if(myInput.equals("4")) {
                //Display the operating cost
            }
            else {
                //Display invalid input
            }
        }
    }
}
