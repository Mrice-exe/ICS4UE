/*
Sean S
03/23/2025
ICS4UE 
Unit 3: Modular Programming
Activity 4: External File Handling – Writing Data 
CustomerList

Variable dictionary:
    filename - The name of the file being read.
    readFile - BufferedReader object used to read the file line by line.
    line - String variable that temporarily stores each line of text read from the file.
    quoteline - the random integer that the selected quote's line is on.
    fnf - FileNotFoundException object that handles cases where the file is not found.
    io - IOException object that handles errors while reading the file.

*/

import java.io.*; //import the io class
import java.util.Random; //import the random class

class CustomerList {
    public static void main(String[] args) {
        System.out.println("Discount Fly Customer List"); 
        System.out.println("---------------------------------");
        System.out.println("Please enter the file path: ");
        String filename = myObj.nextLine();
        try{
            //open file with the filename/path and attach a Buferred Reader
            BufferedReader readFile = new BufferedReader(
                new FileReader(filename));
            String line;
            //print out a random line (quote)
            int quoteline;
            quoteline = (int) (Math.random() * 11) + 1;
            for (int i = 1; i <quoteline; i++){
              readFile.readLine();
                }
            line = readFile.readLine();
            System.out.println("The quote of the day is: " + line);
            readFile.close(); 
        } catch (FileNotFoundException fnf) {
            System.out.println("Error: File not found. Please check the file path. " + fnf);
        } catch (IOException io) {
            System.out.println("Error reading the file. " + io);
        }

    }
}
