/*
Sean S
05/04/2025
ICS4UE 
Unit 6: Introduction to Object-Oriented Programming
Activity 2: Inheritance
LemurDatabase

Variable dictionary:
    scanner – Scanner: Used to collect user input from the console.  
    p – int: Control variable for validating the number of Lemurs to add.  
    o – int: Control variable for validating Lemur type selection.  
    lemurs – int: Stores the total number of Lemurs the user wants to create.  
    lemur – Mammal[]: An array that holds Lemur objects of type Mammal or its subclasses.  
    i – int: Loop counter for indexing through Lemur creation and display.  
    type – int: Stores the user's selection for the type of Lemur to instantiate.  
*/
package LemurDatabase;
import java.util.Scanner;

import javax.swing.*;


public class LemurDatabase {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int p = 1;
    int o = 1;
    int lemurs = 0;
    while (p==1){
      System.out.println("How many Lemurs do you want to add to the list??");
      if (scanner.hasNextInt()){
        lemurs = scanner.nextInt();
        p = 0;
      }else{
        System.out.println("Please input a valid number"); //ask again
        scanner.next(); //clear the scanner
        p = 1;
      }
      
    }
    Mammal lemur[] = new Mammal[lemurs];
    for (int i = 0; i < lemurs; i++) {
        o = 1;
        while (o == 1){
            System.out.println("Please enter the type of Lemur to add:");
            System.out.println("1 - Tree Lemur");
            System.out.println("2 - Desert Lemur");
            System.out.println("3 - Jungle Lemur");
            if (scanner.hasNextInt()){
                int type = scanner.nextInt();
                if (type == 1){
                    System.out.println("Creating Tree Lemur...");
                    lemur[i] = new TreeLemur();
                    o = 0;
                }else if (type == 2){
                    System.out.println("Creating Desert Lemur...");
                    lemur[i] = new DesertLemur();
                    o = 0;
                }else if (type == 3){
                    System.out.println("Creating Jungle Lemur...");
                    lemur[i] = new JungleLemur();
                    o = 0;
                }else{
                    System.out.println("Please input a valid number");
                    o = 1;
                }
            }else{
            System.out.println("Please input a valid number"); //ask again
            scanner.next(); //clear the scanner
            o = 1;
            }
            
        }
    }
    
   scanner.close();
   System.out.println("-----------------------------------");
   for (int i = 0; i < lemur.length; i++) {
    System.out.println(lemur[i]);
  }
  }
}
