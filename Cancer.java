/*
Sean S
03/30/2025
ICS4UE 
Unit 4: Recursion
Activity 2: More Recursion Algorithms
Cancer

Variable dictionary:
    grid - a 2D array of Strings (15 x 15) used to represent the grid of the cancer cells
    blobSize - stores the size of the current "blob" (group of adjacent cancer cells)
    filename - stores the path to the file containing the grid data
    row - stores the current row index while reading the grid file
    line - stores each line read from the file as a String
    col - stores the current column index while reading the grid data
    blobAmount - stores the number of blobs (cancer spots) found in the grid
    blobrow - loop variable used to iterate over rows when searching for blobs
    blobcol - loop variable used to iterate over columns when searching for blobs
*/
import java.io.*; //import the io class
class Cancer {
    public static String grid[][];
    public static int blobSize;
    public static void main(String[] args) {
        String filename = "Cancer.txt";
        //Create 2D array size 15 x 15
        grid = new String[15][15];
        try {
            // Open file with the filename/path and attach a BufferedReader
            BufferedReader readFile = new BufferedReader(new FileReader(filename));
            int row = 0;
            String line;
            // Read each line of the file until there's no more lines
            while ((line = readFile.readLine()) != null && row < 15) {
                // Assuming the file is properly formatted with each line having 15 characters
                for (int col = 0; col < 15; col++) {
                    grid[row][col] = String.valueOf(line.charAt(col));  // Store each character in the grid
                }
                row++;  // Move to the next row in the grid
            }
            displayGrid();
    
            readFile.close(); // Close the file after reading

        } catch (FileNotFoundException fnf) {
            System.out.println("Error: File not found. Please check the file path. " + fnf);
        } catch (IOException io) {
            System.out.println("Error reading the file. " + io);
        }
        //variable to determine the amount of blobs
        int blobAmount = 0;
    
        //go through each coordinate and get rid of the blobs (cancer cells)
        for (int blobrow = 1; blobrow <14;blobrow++){
           for (int blobcol= 1; blobcol <14;blobcol++){
             if (grid[blobrow][blobcol].equals("-")){
               floodFill(blobrow,blobcol);
               blobAmount ++;
             }
           }
        }
        System.out.println("The file had " + blobAmount +
          " cancer spots in it");
        System.out.println("The new grid is:");
        //Print out the new grid
        displayGrid();
    }


    public static void floodFill(int row, int col) {
      /* This function finds groups of "-", and replaces them with " "*/
      if (grid[row][col].equals("-")) {
        grid[row][col] = " ";
        floodFill(row - 1, col - 1);
        floodFill(row - 1, col);
        floodFill(row - 1, col + 1);
        floodFill(row, col - 1);
        floodFill(row, col + 1);
        floodFill(row + 1, col - 1);
        floodFill(row + 1, col);
        floodFill(row + 1, col + 1);
      }
    }
  
    public static void displayGrid() {
    /* This function displays the grid. */
    String output = " 123456789012345";  
    for (int row = 0; row < 15; row++) {  
        output += "\n" + (row + 1); 
        for (int col = 0; col < 15; col++) {  
            output += grid[row][col];
        }
    }
    System.out.println(output);
}
  }
