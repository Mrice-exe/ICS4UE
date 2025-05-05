/*
Sean S
05/04/2025
ICS4UE 
Unit 6: Introduction to Object-Oriented Programming
Activity 2: Inheritance
LemurDatabase

Variable dictionary:
    location – String: Represents the natural habitat or origin of the lemur (default is "Madagascar").  
    classification – String: Indicates the biological classification of the lemur (default is "Prosimian").  
    coat – String: Describes the type of outer covering the lemur has (default is "Fur").  
    output – String: Used to accumulate and format the object's property values in the overridden toString() method.  
*/
package LemurDatabase;

public class Lemur extends Mammal {
    String location;
    String classification;
    String coat;
    public Lemur(){
        super();
        location = "Madagascar";
        classification = "Prosimian";
        coat = "Fur";
        

    }
  
    public String toString(){
        String output = super.toString();
        output += "Location: " + location + "\n";
        output += "Classification: " + classification + "\n";
        output += "Coat: " + coat + "\n";
        
        return output;
    }
  }
