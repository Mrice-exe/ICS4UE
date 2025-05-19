/*
Sean S
05/18/2025
ICS4UE 
Unit 6: Introduction to Object-Oriented Programming
Activity 5: Polymorphism
FuelEfficiency

Variable dictionary:
    vehicles - an array containing the four different types of vehicles extending from the Vehicle class
    scanner - a scanner object used to take in user input
    gas - a double variable that holds the user's desired gas amount
*/
package FuelEfficiency;
import java.util.Scanner;

public class FuelEfficiency{
    public static void main(String[] args) {
        //create array of vehicles
        Vehicle vehicles[] = new Vehicle[4];
        Scanner scanner = new Scanner(System.in);
        double gas;
        System.out.println("Please enter the amount of fuel");
        gas = scanner.nextDouble();
        System.out.println("On "+ gas + "L of gas, the vehicles can drive:" +"\n");
        for (int i = 0; i<4; i++){
            if (i == 0){
                vehicles[i] =new Car();
                System.out.println("Car = " + vehicles[i].getDistance(gas));
            }
            else if (i == 1){
                vehicles[i] = new Truck();
                System.out.println("Truck = "+ vehicles[i].getDistance(gas));
            }
            else if (i == 2){
                vehicles[i] = new HybridCar();
                System.out.println("Hybrid Car = " + vehicles[i].getDistance(gas));
            }
            else if (i == 3){
                vehicles[i] = new Motorcycle();
                System.out.println("Motorcycle = " +vehicles[i].getDistance(gas));
            }
        }

    }
}
