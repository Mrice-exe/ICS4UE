/*
Sean S
05/11/2025
ICS4UE 
Unit 6: Introduction to Object-Oriented Programming
Activity 4: Encapsulation
PhoneTester

Variable dictionary:
    p1 – a CellPhone object with predefined attributes
    p2 – a CellPhone object whose attributes are set through user input
    scanner – a Scanner object used to receive user input from the console
    carrier – a String storing the carrier name entered by the user
    type – a String storing the phone type entered by the user
    speed – a double storing the phone's speed (GHz) entered by the user
    memory – a double storing the phone's memory (GB) entered by the user
    apps – an int storing the number of apps entered by the user
*/
package PhoneTester;

import java.util.Scanner;

import javax.swing.*;


public class PhoneTester {
    public static void main(String[] args) {
        CellPhone p1 = new CellPhone();
        Scanner scanner = new Scanner(System.in);
        p1.setCarrier("Rogers");
        p1.setType( "IPhone");
        p1.setSpeed(1.2);
        p1.setMemory(64.0);
        p1.setNumApps(10);

        System.out.println("Carrier = " + p1.getCarrier());
        System.out.println("Type of phone = " + p1.getType());
        System.out.println("Speed of phone = " + p1.getSpeed()+"Ghz");
        System.out.println("Memory = "+p1.getMemory()+"Gb");
        System.out.println("Number of Apps = "+p1.getNumApps());

        CellPhone p2 = new CellPhone();
        System.out.println("Please enter your desired carrier for your new phone:");
        String carrier = scanner.nextLine();
        p2.setCarrier(carrier);
        System.out.println("Please enter your desired type for your new phone:");
        String type = scanner.nextLine();
        p2.setType(type);
        System.out.println("Please enter your desired speed for your new phone:");
        double speed = scanner.nextDouble();
        p2.setSpeed(speed);
        System.out.println("Please enter your desired memory for your new phone:");
        double memory = scanner.nextDouble();
        p2.setMemory(memory);
        System.out.println("Please enter your desired number of apps for your new phone:");
        int apps = scanner.nextInt();
        p2.setNumApps(apps);

        System.out.println("Carrier = " + p2.getCarrier());
        System.out.println("Type of phone = " + p2.getType());
        System.out.println("Speed of phone = " + p2.getSpeed()+"Ghz");
        System.out.println("Memory = "+p2.getMemory()+"Gb");
        System.out.println("Number of Apps = "+p2.getNumApps());
    }
}
