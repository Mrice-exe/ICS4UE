/*
Sean S
05/18/2025
ICS4UE 
Unit 6: Introduction to Object-Oriented Programming
Activity 5: Polymorphism
FuelEfficiency

Variable dictionary:
    distance - a double containing the distance that the truck can travel depending of the fuel
    ifuel - a parameter for the fuel amount passed to the constructor
*/
package FuelEfficiency;

public class Truck extends Vehicle {
    public double getDistance(double ifuel){
        //find the distance by doing fuel/gaskilometrage times 100
        double distance;
        distance = (ifuel/14.1)*100;
        return distance;
    }
}
