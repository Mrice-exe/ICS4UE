/*
Sean S
03/02/2025
ICS4UE 
Unit 2: Arrays
Activity 2: One-Dimensional Arrays
FundRaising

Variable dictionary:
    schoolNames - a two-dimensional Array that holds the names of the schools 
    donationAmounts - an Array that holds the possible donation amounts corresponding to different donation scenarios
    fundraising - a two-dimensional Array that stores the calculated estimated donations for each school and each donation amount
    totalDonationsBySchool - an Array that holds the total estimated donations for each school across all donation scenarios
    totalDonationsByAmount - an Array that holds the total estimated donations for each donation amount across all schools
    students - an integer that stores the number of students at the selected school
    donationChoice - an integer that stores the selected donation amount scenario 
    schoolChoice - an integer that stores the selected school number 
    
*/
import java.util.ArrayList;  // Import the ArrayList class

class FundRaising {
    public static void main(String[] args) {
        // Array of schools
        String[] schools = {
            "Catholic Central", "Holy Cross", "John Paul II", 
            "Mother Teresa", "Regina Mundi", "St. Joseph", 
            "St. Mary", "St. Thomas Aquinas"
        };

        // Donation amounts in cents
        double[] donationAmounts = {0.25, 0.50, 1.00, 2.00};

        // 2D array to store fundraising estimates (8 schools x 4 donation amounts)
        double[][] fundraising = new double[8][4];

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Show donation choices
            System.out.println("Choose a donation amount:");
            System.out.println("1. 0.25 (25 cents)");
            System.out.println("2. 0.50 (50 cents)");
            System.out.println("3. 1.00 (1 dollar)");
            System.out.println("4. 2.00 (2 dollars)");
            System.out.print("Enter your choice (1-4): ");
            int donationChoice = scanner.nextInt() - 1;

            // Show school choices
            System.out.println("Choose a school:");
            for (int i = 0; i < schools.length; i++) {
                System.out.println((i + 1) + ". " + schools[i]);
            }
            System.out.print("Enter your choice (1-8): ");
            int schoolChoice = scanner.nextInt() - 1;

            // Input number of students
            System.out.print("Enter the number of students at " + schools[schoolChoice] + ": ");
            int numStudents = scanner.nextInt();

            // Calculate the fundraising amount and store it in the array
            double fundraisingAmount = numStudents * donationAmounts[donationChoice];
            fundraising[schoolChoice][donationChoice] = fundraisingAmount;


        // Output the results in a tabular format
        System.out.println("\nFundraising Estimates:");
        System.out.println("Donation Amounts (per student): 0.25  0.50  1.00  2.00");
        System.out.println("--------------------------------------------------------");

        double totalDonation = 0;
        // Print the fundraising table
        for (int i = 0; i < schools.length; i++) {
            System.out.printf("%-20s", schools[i]); // Print school name
            double schoolTotal = 0;
            for (int j = 0; j < donationAmounts.length; j++) {
                System.out.printf("%-8.2f", fundraising[i][j]); // Print fundraising amount
                schoolTotal += fundraising[i][j];
            }
            totalDonation += schoolTotal;
            System.out.printf("| %-8.2f\n", schoolTotal); // Total for the school
        }

        System.out.println("--------------------------------------------------------");
        System.out.printf("Total Donations: %.2f\n", totalDonation);
    }
}
