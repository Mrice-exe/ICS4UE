/*
Sean S
03/23/2025
ICS4UE 
Unit 3: Modular Programming
Activity 4: External File Handling – Writing Data 
CustomerList

Variable dictionary:
    myObj - Scanner object used to take user input.
    filename - String variable that stores the file path entered by the user.
    readFile - BufferedReader object used to read the file line by line.
    line - String variable that temporarily stores each line of text read from the file.
    customers - int variable that stores the number of customers the user wants to add.
    postalCodeFalse - boolean variable used to validate the format of the postal code.
    name - String variable that stores the name of the customer.
    address - String variable that stores the address of the customer.
    city - String variable that stores the city of the customer.
    province - String variable that stores the province of the customer.
    postal - String variable that stores the postal code of the customer.
    customerLine - String variable that combines the customer details into a single line for appending to the file.
    fileOut - PrintWriter object used to write the customer data into the file.
    fnf - FileNotFoundException object that handles cases where the file is not found.
    io - IOException object that handles errors while reading or writing the file.
*/

import java.io.*; // Import the io class
import java.util.Scanner; // Import the Scanner class

class CustomerList {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Discount Fly Customer List");
        System.out.println("---------------------------------");
        System.out.println("Please enter the file path: ");
        String filename = myObj.nextLine();  // Get the filename from the user

        try {
            // Open file with the filename/path and attach a BufferedReader
            BufferedReader readFile = new BufferedReader(new FileReader(filename));
            String line;

            // Print out the entire contents of the file line by line until there are no more lines left.
            while ((line = readFile.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("How many customers would you like to add?");
            int customers = myObj.nextInt();
            myObj.nextLine(); // Consume the newline character
            //iterate for every customer
            for (int i = 1; i <= customers; i++) {
                boolean postalCodeFalse = true;
                System.out.println("What's the customer's name?");
                String name = myObj.nextLine();
                System.out.println("What's the customer's address?");
                String address = myObj.nextLine();
                System.out.println("What's the customer's city?");
                String city = myObj.nextLine();
                System.out.println("What's the customer's province?");
                String province = myObj.nextLine();

                while (postalCodeFalse) {
                    System.out.println("What's the customer's postal code?");
                    String postal = myObj.nextLine();

                    if (postal.length() != 6) {
                        postalCodeFalse = true;
                        System.out.println("The postal code is not valid, please try again.");
                    } else {
                        postalCodeFalse = false;
                        
                        // Check the postal code format
                        for (int j = 0; j < postal.length(); j++) {
                            char character = postal.charAt(j);
                            if (j % 2 == 0) {
                                if (character != 'L') {
                                    postalCodeFalse = true;
                                    break; // End the loop as the postal code is invalid
                                }
                            } else {
                                if (!Character.isDigit(character)) {
                                    postalCodeFalse = true;
                                    break; // End the loop as the postal code is invalid
                                }
                            }
                        }

                        // If postal code is valid, continue with adding customer
                        if (postalCodeFalse == false) {
                            String customerLine = name + ", " + address + ", " + city + ", " + province + ", " + postal;

                            // Append the customer information to the file
                            PrintWriter fileOut = new PrintWriter(new FileWriter(filename, true));
                            fileOut.println(customerLine);
                            fileOut.close();
                            System.out.println("Customer added: " + customerLine);
                        } else {
                            System.out.println("The postal code is not valid, please try again.");
                        }
                    }
                }
            }

            readFile.close(); // Close the file after reading

        } catch (FileNotFoundException fnf) {
            System.out.println("Error: File not found. Please check the file path. " + fnf);
        } catch (IOException io) {
            System.out.println("Error reading the file. " + io);
        }
    }
}
