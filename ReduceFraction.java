/*
Sean S
02/23/2025
ICS4UE 
Unit 4: Recursion
Activity 1: What is Recursion?
ReduceFraction

Variable dictionary:
    numerator - stores the numerator provided by the user
    denominator - stores the denominator provided by the user
    reduced - stores the reduced fraction as a srting
    gcd - stores the greatest common denominator between the numerator and denominator
    rn - the reduced numerator
    rd - the reduced denominator
    n - numerator variable in functions
    d - denominator variable in functions
*/
import java.util.Scanner;  // Import the Scanner class

class ReduceFraction {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Fraction Reducer");
        System.out.println("---------------------------------");
        System.out.println("Enter the numerator of your fraction");
        int numerator = myObj.nextInt();  //take in the input
        System.out.println("Enter the denominator of your fraction");
        int denominator = myObj.nextInt();  //take in the input
        String reduced = reduce(numerator, denominator); //call the function
        System.out.println("The fraction "+numerator+"/"+denominator+" can be reduced to: " + reduced);

    }
    public static String reduce(int n, int d) {
    /* This function reduces a fraction by finding the greatest common denominator between the numerator
    and the denominator
    arguments: int n, int d
    return: String, the reduced fraction in String format
    */
      int gcd = common(n,d); //get the gcd
      int rn = n/gcd; //reduce
      int rd = d/gcd; //reduce
      return rn + "/" + rd; //return the fraction as a string
    }
    public static int common(int n, int d) {
    /* This function calculates the greatest common denominator of two integers
    arguments: int n, int d
    return: int, the greatest common denominator of n and d
    */
      if (d == 0){
        return n; //if d is 0 then return n
      }
      else{
        return common(d,n%d); //recursively use the euclidian algorithm to find the GCD
      }
    }
}
