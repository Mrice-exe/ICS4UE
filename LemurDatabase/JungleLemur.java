/*
Sean S
05/04/2025
ICS4UE 
Unit 6: Introduction to Object-Oriented Programming
Activity 2: Inheritance
LemurDatabase

Variable dictionary:
    food – String: Represents the type of food the Jungle Lemur typically consumes (default is "Fruit").  
    colour – String: Represents the color of the Jungle Lemur (default is "Red").  
    packSize – String: Indicates the size of the social group the Jungle Lemur lives in (default is "Large groups").  
    output – String: Used to accumulate and format the object's property values in the overridden toString() method.  
*/
package LemurDatabase;

public class JungleLemur extends Mammal {
    String food;
    String colour;
    String packSize;
    public JungleLemur(){
        super();
        food = "Fruit";
        colour = "Red";
        packSize = "Large groups";
        

    }
  
    public String toString(){
        String output = super.toString();
        output += "Food: " + food + "\n";
        output += "Colour: " + colour + "\n";
        output += "Pack Size: " + packSize + "\n";
        
        return output;
    }
  }
