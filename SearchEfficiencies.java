/*
Sean S
04/20/2025
ICS4UE 
Unit 5: Searching and Sorting
Activity 3: Efficiency of Searching and Sorting Routines
SearchEfficiencies

Variable dictionary:
    searchnum – int: Stores the number to search for.
    list – ArrayList<Integer>: List of randomly generated integers.
    time – long: Used to measure execution time of search algorithms.
    loopCounter – int: Counts the number of loops performed during search or sort operations.
    comparisonCounter – int: Counts the number of comparisons made during search or sort operations.
    myObj – Scanner: Scanner object to get user input.
    num – int: Number of random integers to generate.
    rand – Random: Used to generate random integers.
    p – int: Loop control variable for input validation.
    randomNum – int: Stores each generated random number temporarily.
    o – int: Loop control variable for input validation.
    returned – boolean: Stores whether the target was found by a search algorithm.
    sorted – ArrayList<Integer>: A version of the list that is sorted before searching.
    array – ArrayList<Integer>: Represents the list being processed (used in methods).
    target – int: The number being searched for in the list.
    i – int: Loop index variable used in sorting and searching.
    j – int: Loop index variable, often used for comparisons.
    index – int: Used in selection sort to check other elements in the list.
    smallest – int: Holds the index of the smallest value found during selection sort.
    left – int: Left boundary of the search range in binary search.
    right – int: Right boundary of the search range in binary search.
    mid – int: Midpoint index used in binary search.
    array2 – ArrayList<Integer>: A list used in the swap method.
    first – int: First index to swap.
    second – int: Second index to swap.
    hold – int: Temporarily stores a value during the swap process.
*/

import java.util.Scanner; // Import the Scanner class
import java.util.ArrayList; //Import the arraylist class
import java.util.Random; //Import the random class
class SearchEfficiencies {
    static int searchnum = 0;
    static ArrayList<Integer> list = new ArrayList<>(); //declare the number array
    static long time = -1; //timer variable
    static int loopCounter = 0; //loop counter variable
    static int comparisonCounter = 0; //comparison counter variable
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        System.out.println("Which searching algorithm is better?");
        System.out.println("---------------------------------");
        int num = 0;
        

        Random rand = new Random(); //create random object
        int p = 1;
        while ( p == 1) {
            System.out.println("How many random numbers would you like to generate?");
            if (myObj.hasNextInt()) {
                num = myObj.nextInt();  // Get the number from the user
                
                p = 0; //break the loop
               
            }else{
                System.out.println("Please enter a valid integer, ");
                myObj.next(); 
                p = 1; //continue asking
            }
        }
        
        for (int i = 0; i < num; i++) { 
            int randomNum = rand.nextInt(1001); // Generates number from 0 to 1000
            list.add(randomNum);
            System.out.println(randomNum);
        }
        int o = 1;
        while (o == 1) {
            System.out.println("Which number would you like to search for?");
            if (myObj.hasNextInt()) {
                searchnum = myObj.nextInt();  // Get the number from the user
                
                o = 0; //break the loop
               
            }else{
                System.out.println("Please enter a valid integer, ");
                myObj.next(); 
                o = 1; //continue asking
            }
        }
        
        System.out.println("------------------------------------------");
        //linear search
        System.out.println("Performing Linear Search (unsorted)");
        time = System.currentTimeMillis();
        boolean returned = linearSearch(list, searchnum);
        time = System.currentTimeMillis() - time;
        System.out.println("Search returned: " + returned);
        System.out.println("Processing Time: " + time + "ms");
        System.out.println("loopCounter = " + loopCounter);
        System.out.println("comparisonCounter = " + comparisonCounter);
        time = -1; //timer variable reset
        loopCounter = 0; //loop counter variable reset
        comparisonCounter = 0; //comparison counter variable reset
        System.out.println("------------------------------------------");

        ArrayList<Integer> sorted = list; //create a sorted list for the sorted linear and the binary search
        selectionSort(sorted);

        //sorted linear search
        System.out.println("Performing Linear Search (sorted list)");
        time = System.currentTimeMillis();
        returned = sortedLinearSearch(sorted, searchnum);
        time = System.currentTimeMillis() - time;
        System.out.println("Search returned: " + returned);
        System.out.println("Processing Time: " + time + "ms");
        System.out.println("loopCounter = " + loopCounter);
        System.out.println("comparisonCounter = " + comparisonCounter);
        time = -1; //timer variable reset
        loopCounter = 0; //loop counter variable reset
        comparisonCounter = 0; //comparison counter variable reset
        System.out.println("------------------------------------------");

        //Binary Search
        System.out.println("Performing Binary Search");
        
        time = System.currentTimeMillis();
        returned = binarySearch(sorted, searchnum);
        time = System.currentTimeMillis() - time;
        System.out.println("Search returned: " + returned);
        System.out.println("Processing Time: " + time + "ms");
        System.out.println("loopCounter = " + loopCounter);
        System.out.println("comparisonCounter = " + comparisonCounter);
        time = -1; //timer variable reset
        loopCounter = 0; //loop counter variable reset
        comparisonCounter = 0; //comparison counter variable reset
        
    
        


        

    }
    
    public static boolean linearSearch(ArrayList<Integer> array, int target) {
        //this function performs a linear search and documents the process, as well as returning true or false if it found the target
        
        for (int i = 0; i < array.size(); i++) {
            loopCounter ++;
            comparisonCounter ++;
            if (array.get(i) == target) {
                
                return true; // Target found 
            }
        }
        return false; // Target not found
    }
    public static boolean sortedLinearSearch(ArrayList<Integer> array, int target) {
        //This function  performs a sorted linear search and documents the process, as well as reutrning ture or false if it found the target

        for (int i = 0; i < array.size(); i++) {
            loopCounter ++;
            comparisonCounter++;
            if (array.get(i) == target) {
                return true; //Target not found
            }else if (array.get(i) > target) {
                return false; //target not in list
            }
        }
        return false; //target not found
    }
    public static void selectionSort(ArrayList<Integer> array) {
        int smallest;
        for (int i = 0; i < array.size() - 1; i++) {
            smallest = i;
            //see if there is a smaller number further in the array
            for (int index = i + 1; index < array.size(); index++) {
                if (array.get(index) < array.get(smallest)) {
                swap(array, smallest, index);
                }
            }
        }
      }
    
      public static void swap(ArrayList<Integer> array2, int first, int second) {
        int hold = array2.get(first);
        array2.set(first, array2.get(second));
        array2.set(second, hold);
      }
      public static boolean binarySearch(ArrayList<Integer> array, int target) {
        //this function performs a binary search on a sorted array and documents the process
        //as well as returning true or false if it had found the target value
        int left = 0;
        int right = array.size() - 1;
    
        while (left <= right) {
            loopCounter++; 
            int mid = (left + right) / 2;

            if (array.get(mid) == target) {
                comparisonCounter++; 
                return true; // Target found
            } else if (array.get(mid) < target) {
                comparisonCounter++; 
                left = mid + 1; // Target is in the right half
            } else {
                comparisonCounter++; 
                right = mid - 1; // Target is in the left half
            }
        }
    
        return false; // Target not found
    }
}
