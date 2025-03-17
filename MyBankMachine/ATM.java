/*
Sean S
03/16/2025
ICS4UE 
Unit 3: Modular Programming
Activity 1: Creating Modules
MyBankMachine

The purpose of this code is to imitate an ATM that can deposite, withdraw, display balance, and calculate interest

Variable dictionary:
    bank: String variable that stores the name of the bank being used.
    deposit: int variable that stores the amount being deposited into the account.
    withdraw: int variable that stores the amount being withdrawn from the account.
    balance: int variable that stores the current balance in the account.
    interest: int variable that stores the interest rate (as a percentage) for the account.
    periods: int variable that stores the number of compounding periods for the interest calculation.
    total: double variable that holds the calculated total balance after applying the compound interest.
    ibalance, ideposit, iwithdraw, ibank, interest, iperiods: parameters fro tehc orresponding variables.
*/
package MyBankMachine;

public class ATM {
    //declare variables
    private String bank;
    private int deposit, withdraw, balance, interest, periods, total;
    //constructor that calculates the balance after a deposite
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
    //constructor that calculates the balance after withdrawing
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
    //constructor that displays the balance
    public String display(int ibalance, String ibank){
        balance = ibalance;
        bank = ibank;
        System.out.println("Your current balance is $" + balance);
        System.out.println("Thank you for banking at " + bank);
        
        
    }
    //constructor that calcualtes and displays the interest
    public int interest(int ibalance, int iinterest, int iperiods){ 
        balance = ibalance;  
        interest = iinterest; 
        periods = iperiods;         

        // Calculate compound interest
        double total = balance * Math.pow(1 + interest, periods);

        System.out.println("Total balance after " + periods + " periods: " + total);
    }
}
