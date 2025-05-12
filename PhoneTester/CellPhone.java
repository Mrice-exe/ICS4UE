/*
Sean S
05/11/2025
ICS4UE 
Unit 6: Introduction to Object-Oriented Programming
Activity 4: Encapsulation
PhoneTester

Variable dictionary:
    carrier – a String representing the phone’s mobile network provider
    type – a String representing the brand or model type of the phone
    speed – a double representing the phone’s processor speed in GHz
    memory – a double representing the phone’s memory capacity in GB
    numApps – an int representing the number of installed apps on the phone
    cCarrier – a parameter for the carrier passed to the constructor
    cType – a parameter for the type passed to the constructor
    cSpeed – a parameter for the speed passed to the constructor
    cMemory – a parameter for the memory passed to the constructor
    cNumApps – a parameter for the number of apps passed to the constructor
    car – a parameter for setting the carrier in setCarrier
    typ – a parameter for setting the type in setType
    spe – a parameter for setting the speed in setSpeed
    mem – a parameter for setting the memory in setMemory
    app – a parameter for setting the number of apps in setNumApps
*/
package PhoneTester;

public class CellPhone {
  private String carrier, type;
  private double speed, memory;
  private int numApps;
  public CellPhone(){
    carrier = "Rogers";
    type = "Samsung";
    speed = 1;
    memory = 32;
    numApps = 10;
  }
  public CellPhone(String cCarrier, String cType, double cSpeed, double cMemory, int cNumApps){
    carrier = cCarrier;
    type = cType;
    speed = cSpeed;
    memory = cMemory;
    numApps = cNumApps;
  }
  public String getCarrier(){
    return carrier;
  }
  public String getType(){
    return type;
  }
  public double getSpeed(){
    return speed;
  }
  public double getMemory(){
    return memory;
  }
  public int getNumApps(){
    return numApps;
  }
  public void  setCarrier(String car){
    carrier = car;
  }
  public void setType(String typ){
    type = typ;
  }
  public void setSpeed(double spe){
    speed = spe;
  }
  public void setMemory(double mem){
    memory = mem;
  }
  public void setNumApps(int app){
    numApps = app;
  }
}
