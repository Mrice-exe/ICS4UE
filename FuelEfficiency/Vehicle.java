/*
Sean S
05/18/2025
ICS4UE 
Unit 6: Introduction to Object-Oriented Programming
Activity 5: Polymorphism
FuelEfficiency

Variable dictionary:
    gasKilometrage – a double representing fuel consumption (litres per 100 km)
    fuelTankSize – a double representing the maximum fuel capacity of the tank in litres
    fuelAvailable – a double representing the current amount of fuel in the tank
    kilometresTravelled – a double representing the total distance the vehicle has travelled
    passengerAmmount – an int representing the number of passengers in the vehicle
    passengerFare – a double representing the fare paid by each passenger
    fuelCost – a double representing the cost of fuel per litre
    revenue – a double storing the total revenue earned from passengers
    cost – a double storing the total cost of fuel used
    gas – a double passed to `addFuel()` representing how much fuel to add
    litresNeeded – a double in `driveVehicle()` representing how much fuel is needed to drive a certain distance
    kms – a double passed to `driveVehicle()` representing the distance to be driven
    kmsThisDrive – a double in `driveVehicle()` representing how far the vehicle can drive with the remaining fuel
    profit – a double in `profitCalculation()` storing the result of revenue minus cost
    ifuel – a double passed to `getDistance()` representing the amount of fuel available for calculation
    distance – a double in `getDistance()` representing the maximum distance that can be driven with the given fuel
    output – a String in `toString()` used to build a readable summary of the vehicle’s state
*/
package FuelEfficiency;


public class Vehicle {
    //I used the same vehicle class from last assignment
    public double gasKilometrage;
    public double fuelTankSize;
    public double fuelAvailable;
    public double kilometresTravelled;
    public int passengerAmmount;
    public double passengerFare;
    public double fuelCost;
    public double revenue;
    public double cost;


  
    public Vehicle() {
      //Default Constructor
      gasKilometrage = 0;
      fuelTankSize = 0;
      fuelAvailable = 0;
      kilometresTravelled = 0;
      passengerAmmount = 0;
      passengerFare = 0;
      fuelCost = 0;
    }
  
    public Vehicle(double gK, double fTS, double fA, double kT, int pA, double pF, double fC){
      gasKilometrage = gK;
      fuelTankSize = fTS;
      fuelAvailable = fA;
      kilometresTravelled = kT;
      passengerAmmount = pA;
      passengerFare = pF;
      fuelCost = fC;
    }
  
    public void addFuel(double gas){
      if((fuelTankSize - fuelAvailable) >= gas){
        fuelAvailable += gas;
        System.out.println("Added " + gas + 
          "L of gas to the tank.");
      }
      else {
        System.out.println("You tried to add "+gas+"L of gas.");
        System.out.println("There is only room for " + 
          (fuelTankSize - fuelAvailable) + "L.");
      }
    }
  
    public void driveVehicle(double kms){
      //Drive the vehicle
      //ex.  If the vehicle uses 9.5L/100 km then
      //litresNeeded = kms * 9.5 / 100
      System.out.println("Drive " + kms + "kms.  Start with " + 
        fuelAvailable + "L of gas.");
      double litresNeeded=(kms*gasKilometrage)/100.0;
      if(fuelAvailable >= litresNeeded){
        fuelAvailable -= litresNeeded;
        kilometresTravelled += kms;
        System.out.println("Used " + litresNeeded + "L of gas.");
      }
      else {
        System.out.println("Ran out of fuel!");
        //Calculate how many kms were driven
        double kmsThisDrive=(fuelAvailable*100.0)/gasKilometrage;
        kilometresTravelled += kmsThisDrive;
        fuelAvailable = 0;
        System.out.println("The vehicle drove " + kmsThisDrive +
          " before running out of gas.");
      }
    }

    public void revenueCalculation(){
        //calculate passengeramount multiplied by the fare to get the revenue
        revenue = passengerAmmount * passengerFare;
        System.out.println("Revenue = "+revenue);
    }
    public void costCalculation(){
        //To calculate the cost, it would be kilometers travelled times divided by 100 times kilometrage
        //then multiply by the cost of gas
        //ex. if kilometrage is 10L/100km and kms travelled is 1000km, and cost of gas is $1 per liter,
        //1000/100 = 10, 10*10 = 100, 100 * 1 = 100 dollars cost in total.
        cost = kilometresTravelled/100;
        cost = cost * gasKilometrage;
        cost = cost *fuelCost;
        System.out.println("Cost = "+cost);

    }
    public void profitCalculation(){
        //calculate the total profits by performing revenue minus cost
        double profit = revenue - cost;
        System.out.println("Profit = "+profit);
    }
  
    
    public double getDistance(double ifuel){
        //find the distance by doing fuel/gaskilometrage times 100
        double distance;
        distance = (ifuel/gasKilometrage)*100;
        return distance;
    }
    public String toString() {
      String output = "Gas Kilometrage = " + gasKilometrage+"\n";
      output += "Fuel Tank Size = " + fuelTankSize + "\n";
      output += "Fuel Available = " + fuelAvailable + "\n";
      output += "Kilometres Driven = "+kilometresTravelled+"\n";
      output += "Passengers = "+passengerAmmount+"\n";
      output += "Fare = "+passengerFare+"\n";
      output += "Fuel Cost = "+fuelCost+"\n";
      return output;
    }
}
