/*
Sean S
03/16/2025
ICS4UE 
Unit 3: Modular Programming
Activity 1: Creating Modules
MyBankMachine

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
package MyBankMachine;

public class ATM {
    //declare variables
    private String bank;
    private int deposit, withdraw, balance, interest, periods, total;
    //default constructor
    public int deposit(int ibalance, int ideposit, String ibank){
        balance = ibalance;
        deposit = ideposit;
        bank = ibank;
        if (ideposit < 0){
          System.out.println("invalid number, please try again");
        }else{
          balance += deposit;
          System.out.println("Your new balance is $" + balance);
          System.out.println("Thank you for banking at " + bank);
        }
    }
    //assigning variables constructor
    public int withdraw(int ibalance, int iwithdraw, String ibank){
        balance = ibalance;
        withdraw = iwithdraw;
        bank = ibank;
        if (iwithdraw < 0){
          System.out.println("invalid number, please try again");
        }else{
          balance -= withdraw;
          System.out.println("Your new balance is $" + balance);
          System.out.println("Thank you for banking at " + bank);

        }
    }
    //Alternate constructor that only uses the make, model, and colour
    public String display(int ibalance, String ibank){
        balance = ibalance;
        bank = ibank;
        System.out.println("Your current balance is $" + balance);
        System.out.println("Thank you for banking at " + bank);
        
        
    }

    public int interest(int ibalance, int iinterest, int iperiods){ 
        balance = ibalance;  
        interest = iinterest; 
        periods = iperiods;         

        // Calculate compound interest
        double total = balance * Math.pow(1 + interest, periods);

        System.out.println("Total balance after " + periods + " periods: " + total);
    }
}
