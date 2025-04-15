/*
Sean S
04/14/2025
ICS4UE 
Unit 5: Searching and Sorting
Activity 2: Sorting Routines
SortingRoutines

Variable dictionary:
    myObj - Scanner object used to take user input for sorting algorithm and sorting order selection.
    num - int variable to store the user's choice for which sorting algorithm to use (1-4).
    ad - int variable to store the user's choice for sorting order (1 for ascending, 2 for descending).
    list - ArrayList<Integer> holding the randomly generated numbers that are to be sorted.
    listsorted - ArrayList<Integer> to store the sorted list after applying the selected sorting algorithm.
    rand - Random object used to generate random numbers for populating the list.
    randomNum - int variable storing each randomly generated number.
    p - int variable used in the while loop to repeatedly prompt the user for a valid sorting algorithm choice.
    o - int variable used in the while loop to repeatedly prompt the user for a valid sorting order choice.
    key - int variable used in the insertionSortAsc and insertionSortDesc methods to hold the current element being inserted into its correct position.
    i, j - int variables used as indices for loops during the sorting operations (e.g., in selectionSortAsc, bubbleSortAsc, insertionSortAsc).
    minIndex - int variable used in selectionSortAsc to track the index of the minimum element during sorting.
    maxIndex - int variable used in selectionSortDesc to track the index of the maximum element during sorting.
    swapped - boolean variable used in bubbleSortAsc and bubbleSortDesc to track if any swaps occurred during an iteration (used to break out of the loop early if no swaps were made).
    pivot - int variable used in the quickSortAsc and quickSortDesc methods to store the pivot element during partitioning.
    low, high - int variables used as indices to specify the sublist range in the quickSortAsc and quickSortDesc methods.
    pi - int variable used to store the partition index returned by the partitionAsc and partitionDesc methods during the quicksort process.
*/

import java.util.Scanner; // Import the Scanner class
import java.util.ArrayList; //Import the arraylist class
import java.util.Random; //Import the random class
class SortingRoutines {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        System.out.println("Sorting Routines");
        System.out.println("---------------------------------");
        int num = 0;
        int ad = 0;
        ArrayList<Integer> list = new ArrayList<>(); //declare the number array
        ArrayList<Integer> listsorted = new ArrayList<>(); //declare the sorted number array

        Random rand = new Random(); //create random object
        System.out.println("How many random numbers would you like to sort?");
        num = myObj.nextInt();
        for (int i = 0; i < num; i++) { 
            int randomNum = rand.nextInt(1001); // Generates number from 0 to 1000
            list.add(randomNum);
        }
        int p = 1;
            while (p == 1) {
                System.out.println("Which sorting algorithm would you like to use?");
                System.out.println("1 - Selection sort, 2 - Bubble Sort, 3 - Insertion sort, 4 - Quick Sort");
                if (myObj.hasNextInt()) {
                    num = myObj.nextInt();  // Get the number from the user
                    if (num >0 && num < 5){
                        p = 0; //break the loop
                    }else{
                    System.out.println("Please enter a valid integer, ");
                    myObj.next(); 
                    p = 1; //continue asking
                    }
                }else{
                    System.out.println("Please enter a valid integer, ");
                    myObj.next(); 
                    p = 1; //continue asking
                }
            }
            int o = 1;
            while (o == 1) {
                System.out.println("In what order do you want the numbers sorted?");
                System.out.println("1 - Ascending, 2 - Descending");
                if (myObj.hasNextInt()) {
                    ad = myObj.nextInt();  // Get the number from the user
                    if (ad >0 && ad < 3){
                        o = 0; //break the loop
                    }else{
                    System.out.println("Please enter a valid integer, ");
                    myObj.next(); 
                    o = 1; //continue asking
                    }
                }else{
                    System.out.println("Please enter a valid integer, ");
                    myObj.next(); 
                    o = 1; //continue asking
                }
            }
            System.out.println("The unsorted list is:");
            System.out.println(list);
            if (num == 1) {  // Selection Sort
                if (ad == 1) {
                    System.out.println("Performing Ascending Selection Sort");
                    listsorted = selectionSortAsc(list);  // Ascending order
                } else if (ad == 2) {
                    System.out.println("Performing Descending Selection Sort");
                    listsorted =selectionSortDesc(list);  // Descending order
                }
            } else if (num == 2) {  // Bubble Sort
                if (ad == 1) {
                    System.out.println("Performing Ascending Bubble Sort");
                    listsorted =bubbleSortAsc(list);  // Ascending order
                } else if (ad == 2) {
                    System.out.println("Performing Descending Bubble Sort");
                    listsorted = bubbleSortDesc(list);  // Descending order
                }
            } else if (num == 3) {  // Insertion Sort
                if (ad == 1) {
                    System.out.println("Performing Ascending Insertion Sort");
                    listsorted = insertionSortAsc(list);  // Ascending order
                } else if (ad == 2) {
                    System.out.println("Performing Descending Insertion Sort");
                    listsorted =insertionSortDesc(list);  // Descending order
                }
            } else if (num == 4) {  // Quick Sort
                if (ad == 1) {
                    System.out.println("Performing Ascending Quick Sort");
                    listsorted = quickSortAsc(list, 0, list.size() - 1);  // Ascending order
                } else if (ad == 2) {
                    System.out.println("Performing Descending Quick Sort");
                    listsorted = quickSortDesc(list, 0, list.size() - 1);  // Descending order
                }
            }
            
            System.out.println("The sorted list is:");
            System.out.println(listsorted);
        


        

    }
    public static ArrayList<Integer> selectionSortAsc(ArrayList<Integer> list) {
        // Selection Sort in Ascending Order
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i; // Start with the first unsorted element
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j; // Find the minimum value in the unsorted portion
                }
            }
            // Swap the found minimum element with the first unsorted element
            int temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
        return list;
    }
    public static ArrayList<Integer> selectionSortDesc(ArrayList<Integer> list) {
        // Selection Sort in Descending Order
        for (int i = 0; i < list.size() - 1; i++) {
            int maxIndex = i; // Start with the first unsorted element
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) > list.get(maxIndex)) {
                    maxIndex = j; // Find the maximum value in the unsorted portion
                }
            }
            // Swap the found maximum element with the first unsorted element
            int temp = list.get(maxIndex);
            list.set(maxIndex, list.get(i));
            list.set(i, temp);
        }
        return list;
    }
    public static ArrayList<Integer> bubbleSortAsc(ArrayList<Integer> list) {
        // Bubble Sort in Ascending Order
        for (int i = 0; i < list.size() - 1; i++) {
            // Flag to check if any swaps happened in the iteration
            boolean swapped = false;
            
            // Perform the bubble sort comparison
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
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
        return list;
    }
    public static ArrayList<Integer> bubbleSortDesc(ArrayList<Integer> list) {
        // Bubble Sort in Descending Order
        for (int i = 0; i < list.size() - 1; i++) {
            // Flag to check if any swaps happened in the iteration
            boolean swapped = false;
            
            // Perform the bubble sort comparison
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) < list.get(j + 1)) {
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
        return list;
    }
    public static ArrayList<Integer> insertionSortAsc(ArrayList<Integer> list) {
        // Insertion Sort in Ascending Order
        for (int i = 1; i < list.size(); i++) {
            int key = list.get(i);  // The element to be inserted into the sorted portion
            int j = i - 1;
    
            // Move elements of list[0..i-1], that are greater than key, to one position ahead
            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));  // Shift the element to the right
                j = j - 1;
            }
    
            // Insert the key element into its correct position
            list.set(j + 1, key);
        }
        return list;
    }
    public static ArrayList<Integer> insertionSortDesc(ArrayList<Integer> list) {
        // Insertion Sort in Descending Order
        for (int i = 1; i < list.size(); i++) {
            int key = list.get(i);  // The element to be inserted into the sorted portion
            int j = i - 1;
    
            // Move elements of list[0..i-1], that are smaller than key, to one position ahead
            while (j >= 0 && list.get(j) < key) {
                list.set(j + 1, list.get(j));  // Shift the element to the right
                j = j - 1;
            }
    
            // Insert the key element into its correct position
            list.set(j + 1, key);
        }
        return list;
    }
    public static ArrayList<Integer> quickSortAsc(ArrayList<Integer> list, int low, int high) {
        if (low < high) {
            // Find the pivot element such that the element smaller than the pivot is on the left
            // and elements greater than the pivot are on the right
            int pi = partitionAsc(list, low, high);
    
            // Recursively sort the subarrays
            quickSortAsc(list, low, pi - 1);  // Sort the left side
            quickSortAsc(list, pi + 1, high); // Sort the right side
        }
        return list;
    }
    
    public static int partitionAsc(ArrayList<Integer> list, int low, int high) {
        int pivot = list.get(high);  // Pivot element (taking the last element as the pivot)
        int i = low - 1; // Index of the smaller element
    
        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (list.get(j) <= pivot) {
                i++;
                // Swap list[i] and list[j]
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }
        // Swap the pivot element with the element at index i+1
        int temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);
    
        return i + 1; // Return the partition index
    }
    public static ArrayList<Integer> quickSortDesc(ArrayList<Integer> list, int low, int high) {
        if (low < high) {
            // Find the pivot element such that the elements smaller than the pivot are on the right
            // and elements greater than the pivot are on the left
            int pi = partitionDesc(list, low, high);
    
            // Recursively sort the subarrays
            quickSortDesc(list, low, pi - 1);  // Sort the left side
            quickSortDesc(list, pi + 1, high); // Sort the right side
        }
        return list;
    }
    
    public static int partitionDesc(ArrayList<Integer> list, int low, int high) {
        int pivot = list.get(high);  // Pivot element (taking the last element as the pivot)
        int i = low - 1; // Index of the larger element
    
        for (int j = low; j < high; j++) {
            // If the current element is greater than or equal to the pivot
            if (list.get(j) >= pivot) {
                i++;
                // Swap list[i] and list[j]
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }
        // Swap the pivot element with the element at index i+1
        int temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);
    
        return i + 1; // Return the partition index
    }
}
