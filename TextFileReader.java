/*
Sean S
03/23/2025
ICS4UE 
Unit 3: Modular Programming
Activity 3: External File Handling 
TextFileReader

Variable dictionary:
    filename - String variable that stores the file path entered by the user.
    myObj - Scanner object used to take user input from the console.
    readFile - BufferedReader object used to read the file line by line.
    line - String variable that temporarily stores each line of text read from the file.
    fnf - FileNotFoundException object that handles cases where the file is not found.
    io - IOException object that handles errors while reading the file.

*/
import java.util.Scanner;  // Import the Scanner class
import java.io.*; //import the io class


class TextFileReader {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Txt File Reader"); 
        System.out.println("---------------------------------");
        System.out.println("Please enter the file path: ");
        String filename = myObj.nextLine();  
        try{
            //open file with the filename/path and attach a Buferred Reader
            BufferedReader readFile = new BufferedReader(
                new FileReader(filename));
            String line;
            //print out the entire contetns of the file line by line until there are no more lines left.
            while ((line = readFile.readLine()) != null){ 
                System.out.println(line);
            }
            readFile.close(); 
        } catch (FileNotFoundException fnf) {
            System.out.println("Error: File not found. Please check the file path. " + fnf);
        } catch (IOException io) {
            System.out.println("Error reading the file. " + io);
        }

    }
}
