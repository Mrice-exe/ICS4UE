/*
Sean S
03/02/2025
ICS4UE 
Unit 2: Arrays
Activity 2: Two-Dimensional Arrays
GameOfLife

Variable dictionary:
    size - an integer that represents the size of the grid (20x20).
    grid - a two-dimensional integer array that holds the current state of the grid (alive or dead cells).
    nextGrid - a two-dimensional integer array that holds the next state of the grid for the next generation.
    scanner - a Scanner object used to take input from the user for the number of live cells and to decide whether to continue.
    numLiveCells - an integer that stores the number of live cells in the first generation as entered by the user.
    x - an integer that stores the row index for placing a live cell in the grid.
    y - an integer that stores the column index for placing a live cell in the grid.
    liveNeighbors - an integer that keeps track of the number of live neighbors of a cell for applying the Game of Life rules.
    response - a String that stores the user's response to continue to the next generation or not.
    
*/
import java.util.ArrayList;  // Import the ArrayList class
import java.util.Scanner;  // Import the Scanner class


public class GameOfLife {
  public static void main(String[] args) {
        int size = 20; // Grid size (20x20)
        int[][] grid = new int[size][size];
        int[][] nextGrid = new int[size][size];
        Scanner scanner = new Scanner(System.in);

        // Get the number of live cells in the first generation
        System.out.print("Enter the number of live cells in the first generation: ");
        int numLiveCells = scanner.nextInt();

        // Initialize the grid with random live cells
        for (int i = 0; i < numLiveCells; i++) {
            int x = (int) (Math.random() * size);
            int y = (int) (Math.random() * size);
            grid[x][y] = 1; // Set the cell as alive (1)
        }

        // Print the initial grid
        System.out.println("Initial Grid:");
        printGrid(grid);

        // Simulate the Game of Life for a specified number of generations
        while (true) {
            // Apply the rules to the grid
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    int liveNeighbors = countLiveNeighbors(grid, i, j, size);
                    if (grid[i][j] == 1) {
                        // Rule 1: If a cell is alive and has 2 or 3 neighbors, it survives
                        if (liveNeighbors == 2 || liveNeighbors == 3) {
                            nextGrid[i][j] = 1;
                        } else {
                            nextGrid[i][j] = 0;
                        }
                    } else {
                        // Rule 2: If a cell is dead and has exactly 3 neighbors, it becomes alive
                        if (liveNeighbors == 3) {
                            nextGrid[i][j] = 1;
                        } else {
                            nextGrid[i][j] = 0;
                        }
                    }
                }
            }

            // Copy the next grid to the current grid for the next iteration
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    grid[i][j] = nextGrid[i][j];
                }
            }

            // Print the updated grid
            System.out.println("Next Generation:");
            printGrid(grid);

            // Ask user if they want to continue
            System.out.print("Do you want to continue to the next generation? (yes/no): ");
            String response = scanner.next().toLowerCase();
            if (!response.equals("yes")) {
                break;
            }
        }

        scanner.close();
    }

    // Function to count the number of live neighbors around a given cell
    private static int countLiveNeighbors(int[][] grid, int x, int y, int size) {
        int liveNeighbors = 0;

        // Check all 8 possible neighbors (horizontal, vertical, and diagonal)
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                // Skip the cell itself
                if (i == 0 && j == 0) {
                    continue;
                }
                int nx = x + i;
                int ny = y + j;

                // Ensure the neighbor is within the grid bounds
                if (nx >= 0 && nx < size && ny >= 0 && ny < size) {
                    liveNeighbors += grid[nx][ny];
                }
            }
        }

        return liveNeighbors;
    }

    // Function to print the grid
    private static void printGrid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    System.out.print("O "); // Alive cell
                } else {
                    System.out.print(". "); // Dead cell
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
