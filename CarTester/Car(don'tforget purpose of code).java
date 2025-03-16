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
    //consturctors
    public Car(){
        make = "Toyota";
        model = "Rav4";
        colour = "Black";
        year = 0;
        price = 0;
        horsepower = 0 ;
    }
    public Car(String imake, String imodel, String icolour, int iyear, int iprice, int ihorsepower){
        make2 = imake
        model2 = imodel
        colour2 = icolour
        year2 = iyear
        price2 = iprice
        horsepower2 = ihorsepower

    }
    //2nd constructor
    public Car(){
        make = "Toyota";
        model = "Rav4";
        colour = "Black";
        year = 0;
        price = 0;
        horsepower = 0 ;
    }
    public Car(String imake, String imodel, String icolour, int iyear, int iprice, int ihorsepower){
        make2 = imake
        model2 = imodel
        colour2 = icolour
        year2 = iyear
        price2 = iprice
        horsepower2 = ihorsepower

    }
    //3rd constructor
    public Car(){
        make = "Toyota";
        model = "Rav4";
        colour = "Black";
        year = 0;
        price = 0;
        horsepower = 0 ;
    }
    public Car(String imake, String imodel, String icolour, int iyear, int iprice, int ihorsepower){
        make3 = imake
        model3 = imodel
        colour3 = icolour
        year3 = iyear
        price3 = iprice
        horsepower3 = ihorsepower

    }
    public void honk(){
        System.out.println("HONK!")
    }
    public String toString(){
        String output = "First Car" + "\n";
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
