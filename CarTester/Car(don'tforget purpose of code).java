/*
Sean S
03/02/2025
ICS4UE 
Unit 2: Arrays
Activity 2: One-Dimensional Arrays
Triplets


Variable dictionary:
    nouns - stores the noun Strings into an array
    verbs - stores the verbs strings into an array
    rhymingNouns - stores the nouns that rhyme into an array
    verb1, verb2, verb3 - the first, second, and third randomly chosen verbs for the poem
    rhymingNoun1, rhymingNoun2, rhymingNoun3 - the first, second, and third randomly chosen rhyming nouns for the poem
    randomNum - a random integer used for randomly picking nouns or verbs
    
*/
package CarTester;

public class Car {
    //declare variables
    private String make, model, colour;
    private int year, price, horsepower;
    //default constructor
    public Car(){
        make = "Toyota";
        model = "Rav4";
        colour = "Black";
        year = 2020;
        price = 40000;
        horsepower = 200 ;
    }
    //assigning variables constructor
    public Car(String imake, String imodel, String icolour, int iyear, int iprice, int ihorsepower){
        make = imake;
        model = imodel;
        colour = icolour;
        year = iyear;
        price = iprice;
        horsepower = ihorsepower;
    }
    //Alternate constructor that only uses the make, model, and colour
    public Car(String imake, String imodel, String icolour){
        make = imake;
        model = imodel;
        colour = icolour;
        //set year, price, and horsepower to random numbers within a reasonable range
        year = (int) (Math.random() *(2025-1980+1))+1980;
        price = (int) (Math.random() *(80000-30000+1))+30000;
        horsepower = (int) (Math.random() *(270-150+1))+150;
        
    }
    public void honk(){
        System.out.println("HONK!")
    }
    public String toString(){
        String output = "Car details" + "\n";
        output += "Make: " + make + "\n";
        output += "Model: " + model + "\n";
        output += "Colour: " + colour + "\n";
        output += "Year: " + year + "\n";
        output += "Price: " + price + "\n";
        output += "Horsepower: " + horsepower + "\n";
        return output;
    }
  }
}
