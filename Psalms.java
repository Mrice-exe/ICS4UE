/*
Sean S
04/14/2025
ICS4UE 
Unit 5: Searching and Sorting
Activity 1: Searching Routines
Psalms

Variable dictionary:
    myObj - Scanner object used to take user input.
    filename - String variable that stores the file path to the Psalms text file.
    num - int variable that stores the Psalm number entered by the user.
    psalmnum - ArrayList<Integer> that stores the Psalm numbers read from the file.
    psalms - ArrayList<String> that stores the Psalm texts corresponding to the numbers.
    p - int variable used as a control flag for the input validation loop.
    readFile - BufferedReader object used to read the file line by line.
    line - String variable that temporarily stores each line read from the file.
    counter - int variable that tracks line number while reading to differentiate between number and text.
    index - int variable that stores the index of the matched Psalm after binary search.
    fnf - FileNotFoundException object that handles cases where the file is not found.
    io - IOException object that handles errors while reading the file.
    x - int parameter used in the checkifthere method to search for a Psalm number.
    left - int parameter used in the binarySearch method to mark the left boundary of the search range.
    right - int parameter used in the binarySearch method to mark the right boundary of the search range.
    target - int parameter in binarySearch representing the Psalm number being searched for.
    mid - int variable used in binarySearch to store the midpoint of the current search range.
*/

import java.io.*; // Import the io class
import java.util.Scanner; // Import the Scanner class
import java.util.ArrayList; //Import the arraylist class

class Psalms {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String filename = "Psalms.txt"; // Path to the file
        System.out.println("Psalm finder");
        System.out.println("---------------------------------");
        int num = 0;
        ArrayList<Integer> psalmnum = new ArrayList<>(); //declare the number array
        ArrayList<String> psalms = new ArrayList<>();; //declare the psalm array

        try {
            int p = 1;
            while (p == 1) {
                System.out.println("the number of the Psalm you would like to see");
                if (myObj.hasNextInt()) {
                    num = myObj.nextInt();  // Get the number from the user
                    p = 0; //break the loop
                }else{
                    System.out.println("Please enter a valid integer, ");
                    myObj.next(); 
                    p = 1; //continue asking
                }
            }
            // Open file with the filename/path and attach a BufferedReader
            BufferedReader readFile = new BufferedReader(new FileReader(filename));
            String line;
            int counter = 1;
            while ((line = readFile.readLine()) != null) { //go till end of the file
                if (counter %2 == 1){ //every odd line is the number, every even is the line.
                    psalmnum.add(Integer.parseInt(line)); 
                }
                else{
                    psalms.add(line);
                }
                counter ++;
            }
            if (!checkifthere(psalmnum, num)) {
                System.out.println("There is no psalm with that integer in the dataset");
            }
            else{
                int index = binarySearch(psalmnum, 0, psalmnum.size() - 1, num);
                System.out.println("Psalm " + num + ": " + psalms.get(index));
            }
            readFile.close(); // Close the file after reading

        } catch (FileNotFoundException fnf) {
            System.out.println("Error: File not found. Please check the file path. " + fnf);
        } catch (IOException io) {
            System.out.println("Error reading the file. " + io);
        }
        
    }
    public static Boolean checkifthere(ArrayList<Integer> list,int x) {
        for (int i : list) { //go through each number and see if the target number is on the list
            if (x == i) {
                return true;
            }
        }
        return false;
    }
    public static int binarySearch(ArrayList<Integer> list, int left, int right, int target) {
        //this function searches the list for the number, knowing that it's in the list and it's sorted. Using the binary search algorithm
        if (left > right) return -1;

        int mid = (left + right) / 2;
        if (list.get(mid) == target) {
            return mid; // Return the index of the found Psalm
        } else if (list.get(mid) > target) {
            return binarySearch(list, left, mid - 1, target);
        } else {
            return binarySearch(list, mid + 1, right, target);
        }
}
}
