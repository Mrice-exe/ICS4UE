package VehicleTester;
import java.util.Scanner;

import javax.swing.*;

public class VehicleTester {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int p = 1;
    double gasPrice = 0;
    while (p==1){
      System.out.println("What is the price of gas today in $/L?");
      if (scanner.hasNextDouble()){
        gasPrice = scanner.nextDouble();
        p = 0;
      }else{
        System.out.println("Please input a valid number"); //ask again
        scanner.next(); //clear the scanner
        p = 1;
      }
      
    }
   scanner.close();
    Vehicle car1 = new Vehicle(7.5, 60.0, 60.0, 0.0,15,5.75,gasPrice);
    //Show Vehicle Info
    System.out.println(car1);

    //Drive car for 100km
    car1.driveVehicle(100.0);
    System.out.println(car1);

    //Drive car for 450 kms
    car1.driveVehicle(450.0);
    System.out.println(car1);

    //Try to drive 1000 km - runs out of gas
    car1.driveVehicle(1000.0);
    System.out.println(car1);

    //Add 25L of gas
    car1.addFuel(25.0);
    System.out.println(car1);

    //Try to add 100 L of gas
    car1.addFuel(100.0);
    System.out.println(car1);

    //Calculate and display Revenue
    car1.revenueCalculation();
    //Calculate and display Cost
    car1.costCalculation();
    //Calculate and display Profit
    car1.profitCalculation();
  }
}
