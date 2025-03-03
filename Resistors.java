/*
Sean S
03/02/2025
ICS4UE 
Unit 2: Arrays
Activity 1: One-Dimensional Arrays
Resistors

Variable dictionary:
    colors - an array that holds all colours
    values - an array that holds all the corresponding values
    input - the user input of the resistor colour code
    total - the calculated total ohms
    
*/
import java.util.ArrayList;  // Import the ArrayList class
import java.util.Scanner;  // Import the ArrayList class

class Resistors {
    public static void main(String[] args) {
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Create lists for color names and their corresponding values
        ArrayList<String> colors = new ArrayList<>();
        // Populate the list with color names
        colors.add("BLACK");  
        colors.add("BROWN");
        colors.add("RED"); 
        colors.add("ORANGE");
        colors.add("YELLOW");
        colors.add("GREEN");
        colors.add("BLUE");  
        colors.add("VIOLET"); 
        colors.add("GREY");
        colors.add("WHITE"); 

        // Create a list for corresponding values of the colors
        ArrayList<Integer> values = new ArrayList<>();
        // Populate the list with values for each color
        values.add(0);
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        values.add(7);
        values.add(8);
        values.add(9);

        // Ask the user for the resistor color code
        System.out.print("What is your resistor's colour code? Separate each colour by hyphens (e.g., RED-BROWN-ORANGE): ");
        String input = scanner.nextLine();
        input = input.toUpperCase();  // Convert the input to uppercase

        // Split the input into an array of color strings
        String[] inputColors = input.split("-");

        // Initialize the total value
        int total = 0;

        // Calculate the resistor value based on the color bands
        for (int i = 0; i < 2; i++) {
            String color = inputColors[i];
            int index = colors.indexOf(color);  // Get the index of the color directly
            total = total * 10 + values.get(index);   // Build the first part of the resistor value
        }

        // Get the power of ten from the third color band
        String thirdColor = inputColors[2];
        int powerIndex = colors.indexOf(thirdColor);  // Get the index of the power color

        // Calculate the final resistor value
        total *= Math.pow(10, powerIndex);

        // Print the result
        System.out.println("The resistor value is: " + total + " ohms");
    }
}
