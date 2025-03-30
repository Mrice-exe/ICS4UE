/*
Sean S
02/23/2025
ICS4UE 
Unit 4: Recursion
Activity 1: What is Recursion?
NChooseR

Variable dictionary:
    n - stores the desired nth value of the user for fibonacci
    r - stores the calcualte number from the sequence
    total - stores the number of possible ways to choose r objects from a set of n objects
    ans -  a temporary variable that holds the answer to the formula n!/r!(n-r)!
*/
import java.util.Scanner;  // Import the Scanner class
 m

class NChooseR {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Total Combinations Calculator");
        System.out.println("---------------------------------");
        System.out.println("Enter the number of objects available");
        int n = myObj.nextInt();  //take in the input
        System.out.println("Enter the number of different objects chosen from the set");
        int r = myObj.nextInt();  //take in the input
        int total = combinations(n, r); //call the function
        System.out.println("There are " + total+" possible ways to choose "+r+" objects from a set of " +n +" objects");

    }
    public static int combinations(int n, int r) {
    /* This function calculates the number of ways to choose r different objects from a set of n objects
    using the formula n!/r!(n-r)!
    arguments: int n, int r
    return: int, the answer of the formula with the variables plugged in
    */
    //use the formula
        int ans = fact(n) / (fact(r) * fact(n-r));
        return ans;
    }
    public static int fact(int x) {
    /* This function calculates the facotiral of n using recursion
    arguments: int x
    return: int, the factorial of x
    */
      if (x < 2){
        return x; //if n is 1 or 0 then return n
      }
      else{
        return x*fact(x-1); //recursively multiply x with the factorial of x-1
      }
    }
}
