/*
Sean S  
05/04/2025  
ICS4UE  
Unit 6: Introduction to Object-Oriented Programming  
Activity 2: Inheritance  
LemurDatabase  

Variable dictionary:
    food – String: Represents the type of food the Desert Lemur typically consumes (default is "Cacti").  
    colour – String: Represents the color of the Desert Lemur (default is "White").  
    babyDeathRate – Double: Represents the baby death rate for the Desert Lemur species (default is 0.66).  
    output – String: Used to accumulate and format the object's property values in the overridden toString() method.  
*/
package LemurDatabase;

public class DesertLemur extends Mammal {
    String food;
    String colour;
    Double babyDeathRate;
    public DesertLemur(){
        super();
        food = "Cacti";
        colour = "White";
        babyDeathRate = 0.66;
        

    }
  
    public String toString(){
        String output = super.toString();
        output += "Food: " + food + "\n";
        output += "Colour: " + colour + "\n";
        output += "Baby Death Rate: " + babyDeathRate + "\n";
        
        return output;
    }
  }
