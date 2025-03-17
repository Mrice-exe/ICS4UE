/*
Sean S
03/16/2025
ICS4UE 
Unit 3: Modular Programming
Activity 2: Modifying Modules
TwoDogsMeet

The purpose of this code is to create three different cars, each using a different constructor, 
properties specified by the user.

Variable dictionary:
    make: String variable that stores the make of the car.
    model: String variable that stores the model of the car.
    colour: String variable that stores the color of the car.
    year: Integer variable that stores the manufacturing year of the car.
    price: Integer variable that stores the price of the car.
    horsepower: Integer variable that stores the horsepower of the car.
    output: a string that holds the details of the car that will be ouputted
    imake, imodel, icolour, iyear, iprice, ihorsepower: the parameters of the corresponding variables
    
*/
package CarTester;

public class car {
    //declare variables
    private String make, model, colour;
    private int year, price, horsepower;
    //default constructor
    public car(){
        make = "Toyota";
        model = "Rav4";
        colour = "Black";
        year = 2020;
        price = 40000;
        horsepower = 200 ;
    }
    //assigning variables constructor
    public car(String imake, String imodel, String icolour, int iyear, int iprice, int ihorsepower){
        make = imake;
        model = imodel;
        colour = icolour;
        year = iyear;
        price = iprice;
        horsepower = ihorsepower;
    }
    //Alternate constructor that only uses the make, model, and colour
    public car(String imake, String imodel, String icolour){
        make = imake;
        model = imodel;
        colour = icolour;
        //set year, price, and horsepower to random numbers within a reasonable range
        year = (int) (Math.random() *(2025-1980+1))+1980;
        price = (int) (Math.random() *(80000-30000+1))+30000;
        horsepower = (int) (Math.random() *(270-150+1))+150;
        
    }
    public void honk(){ //constructor to honk the car
        System.out.println("HONK!");
    }
    public String toString(){ //constructor to output all of the properties
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
