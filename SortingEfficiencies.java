/*
Sean S
04/20/2025
ICS4UE 
Unit 5: Searching and Sorting
Activity 3: Efficiency of Searching and Sorting Routines
SortingEfficiencies

Variable dictionary:
    list – ArrayList<Integer>: Holds the list of random integers to be sorted.
    time – long: Used to measure and store execution time for sorting algorithms.
    loopCounter – int: Tracks the number of iterations through loops for performance analysis.
    comparisonCounter – int: Tracks the number of comparisons made in sorting algorithms.
    shiftCounter – int: Tracks the number of value shifts or swaps made during sorting.
    myObj – Scanner: Scanner object used to receive user input.
    num – int: Number of random integers the user wants to generate.
    rand – Random: Random object used to generate random integers.
    p – int: Control variable for input validation loop (for integer entry).
    randomNum – int: Temporary variable to store a generated random number before adding to list.
    temparr – ArrayList<Integer>: Reference used to point to the list being sorted in each sort test.
    i – int: Loop index used in various loops (outer and inner) in sorting methods.
    j – int: Loop index, often used for inner loops or partitioning (especially in insertion and quick sort).
    index – int: Index variable used in selection sort to find the smallest element.
    smallest – int: Holds the index of the smallest element found in selection sort.
    swapped – boolean: Flag used in bubble sort to detect if a swap occurred during a pass.
    pi – int: Partition index returned by the partition function in quicksort.
    pivot – int: The pivot element used to partition the array in quicksort.
    low – int: Left boundary index for quicksort.
    high – int: Right boundary index for quicksort.
    temp – int: Temporary variable used during swapping of elements.
    array – ArrayList<Integer>: List passed to sorting methods (generic reference).
    array2 – ArrayList<Integer>: Specific reference in the `swap` method for clarity.
    first – int: Index of the first element to be swapped in the `swap` method.
    second – int: Index of the second element to be swapped in the `swap` method.
    hold – int: Temporary holder for swapping values in the `swap` method.
*/

import java.util.Scanner; // Import the Scanner class
import java.util.ArrayList; //Import the arraylist class
import java.util.Random; //Import the random class
class SortingEFficiencies {
    static int searchnum = 0;
    static ArrayList<Integer> list = new ArrayList<>(); //declare the number array
    static long time = -1; //timer variable
    static int loopCounter = 0; //loop counter variable
    static int comparisonCounter = 0; //comparison counter variable
    static int shiftCounter = 0; //shift counter variable
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        System.out.println("Which sorting algorithm is better?");
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
        myObj.close();

        System.out.println("------------------------------------------");
        //Selection Sort
        ArrayList <Integer> temparr = list;
        System.out.println("Performing Selection Sort");
        time = System.currentTimeMillis();
        selectionSort(temparr);
        time = System.currentTimeMillis() - time;
        
        System.out.println("Processing Time: " + time + "ms");
        System.out.println("loopCounter = " + loopCounter);
        System.out.println("comparisonCounter = " + comparisonCounter);
        System.out.println("shiftCounter = " + shiftCounter);
        time = -1; //timer variable reset
        loopCounter = 0; //loop counter variable reset
        comparisonCounter = 0; //comparison counter variable reset
        shiftCounter = 0; //shift counter variable reset
        System.out.println("------------------------------------------");


        //Bubble Sort
        temparr = list;
        System.out.println("Performing Bubble Sort");
        time = System.currentTimeMillis();
        bubbleSort(temparr);
        time = System.currentTimeMillis() - time;
        
        System.out.println("Processing Time: " + time + "ms");
        System.out.println("loopCounter = " + loopCounter);
        System.out.println("comparisonCounter = " + comparisonCounter);
        System.out.println("shiftCounter = " + shiftCounter);
        time = -1; //timer variable reset
        loopCounter = 0; //loop counter variable reset
        comparisonCounter = 0; //comparison counter variable reset
        shiftCounter = 0; //shift counter variable reset
        System.out.println("------------------------------------------");

        //Insertion Sort
        temparr = list;
        System.out.println("Performing Insertion Sort");
        time = System.currentTimeMillis();
        insertionSort(temparr);
        time = System.currentTimeMillis() - time;
        
        System.out.println("Processing Time: " + time + "ms");
        System.out.println("loopCounter = " + loopCounter);
        System.out.println("comparisonCounter = " + comparisonCounter);
        System.out.println("shiftCounter = " + shiftCounter);
        time = -1; //timer variable reset
        loopCounter = 0; //loop counter variable reset
        comparisonCounter = 0; //comparison counter variable reset
        shiftCounter = 0; //shift counter variable reset
        System.out.println("------------------------------------------");

        //Quick Sort
        temparr = list;
        System.out.println("Performing Quick Sort");
        time = System.currentTimeMillis();
        quickSort(temparr,0, temparr.size()-1);
        time = System.currentTimeMillis() - time;
        System.out.println("Processing Time: " + time + "ms");
        System.out.println("loopCounter = " + loopCounter);
        System.out.println("comparisonCounter = " + comparisonCounter);
        System.out.println("shiftCounter = " + shiftCounter);
        time = -1; //timer variable reset
        loopCounter = 0; //loop counter variable reset
        comparisonCounter = 0; //comparison counter variable reset
        shiftCounter = 0; //shift counter variable reset
        System.out.println("------------------------------------------");


        
    
        


        

    }
    
    
    public static void selectionSort(ArrayList<Integer> array) {
        //This function performs a selection sort and documents the process
        int smallest;
        for (int i = 0; i < array.size() - 1; i++) {
            loopCounter ++;
            smallest = i;
            //see if there is a smaller number further in the array
            for (int index = i + 1; index < array.size(); index++) {
                loopCounter ++;
                comparisonCounter ++;
                if (array.get(index) < array.get(smallest)) {
                    swap(array, smallest, index);
                }
            }
        }
      }
    
      public static void swap(ArrayList<Integer> array2, int first, int second) {
        shiftCounter ++;
        int hold = array2.get(first);
        array2.set(first, array2.get(second));
        array2.set(second, hold);
      }
    public static void bubbleSort(ArrayList<Integer> list) {
        //This function performs a bubble sort and documents the process
        for (int i = 0; i < list.size() - 1; i++) {
            loopCounter ++;
            // Flag to check if any swaps happened in the iteration
            boolean swapped = false;
            
            // Perform the bubble sort comparison
            for (int j = 0; j < list.size() - 1 - i; j++) {
                loopCounter ++;
                comparisonCounter ++;
                if (list.get(j) > list.get(j + 1)) {
                    shiftCounter ++;
                    // Swap the elements if they're in the wrong order
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swapped = true;
                }
            }
            
            // If no swaps happened, the list is already sorted, exit early
            if (!swapped) {
                break;
            }
        }
    }
    
    public static void insertionSort(ArrayList<Integer> list) {
        // This function performs an insertion sort and documents the process
        for (int i = 1; i < list.size(); i++) {
            loopCounter ++;
            int key = list.get(i);  // The element to be inserted into the sorted portion
            int j = i - 1;
    
            // Move elements of list[0..i-1], that are greater than key, to one position ahead
            while (j >= 0) {
                comparisonCounter++;
                if (list.get(j) > key) {
                    loopCounter++;
                    shiftCounter++;
                    list.set(j + 1, list.get(j));
                    j = j - 1;
                } else {
                    break; // Stop when no more shifting is needed
                }
            }
            shiftCounter ++;
            // Insert the key element into its correct position
            list.set(j + 1, key);
        }

    }
    public static void quickSort(ArrayList<Integer> list, int low, int high) {
        //this function performs a quicksort and documents the process
        loopCounter ++;
        
        if (low < high) {
            // Find the pivot element such that the element smaller than the pivot is on the left
            // and elements greater than the pivot are on the right
            int pi = partition(list, low, high);
    
            // Recursively sort the subarrays
            quickSort(list, low, pi - 1);  // Sort the left side
            quickSort(list, pi + 1, high); // Sort the right side
        }
        
    }
    public static int partition(ArrayList<Integer> list, int low, int high) {
        //this function is a part of the quicksort algorithm
        int pivot = list.get(high);  // Pivot element (taking the last element as the pivot)
        int i = low - 1; // Index of the smaller element
    
        for (int j = low; j < high; j++) {
            loopCounter ++;
            // If the current element is smaller than or equal to the pivot
            comparisonCounter ++;
            if (list.get(j) <= pivot) {
                i++;
                // Swap list[i] and list[j]
                shiftCounter ++;
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }
        // Swap the pivot element with the element at index i+1
        shiftCounter ++;
        int temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);
    
        return i + 1; // Return the partition index
    }
}
