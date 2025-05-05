/*
Sean S
05/04/2025
ICS4UE 
Unit 6: Introduction to Object-Oriented Programming
Activity 2: Inheritance
LemurDatabase

Variable dictionary:
    itsAge – int: Represents the age of the mammal in years, randomly assigned between 0 and 20.  
    itsWeight – double: Represents the weight of the mammal in kilograms, randomly assigned between 4.7 and 5.0.  
    male – boolean: Indicates the sex of the mammal (true for male, false for female).  
    morf – int: Temporary variable used to randomly assign the sex of the mammal.  
*/
package LemurDatabase;

public class Mammal {
    private int itsAge;
    private double itsWeight;
    private boolean male;
  
    public Mammal() {
      itsAge = (int)(Math.random() * 21); 
      itsWeight = 4.7 + Math.random() * (5 - 4.7);
      int morf =(int) (Math.random() * 2);
      if (morf == 0){
        male = false;
      }else{
        male = true;
      }
      
    }
  
    public int getAge() {
      return itsAge;
    }
  
    public double getWeight() {
      return itsWeight;
    }
  
    public void setAge(int newAge) {
      itsAge = newAge;
    }
  
    public void setWeight(double newWeight) {
      itsWeight = newWeight;
    }
  

    public String toString(){
        String output = "";
        output += "Age: " + itsAge + "\n";
        output += "Weight: " + itsWeight + "\n";
        if (male) {
            output += "Sex: Male\n";
        } else {
            output += "Sex: Female\n";
        }
        return output;
    }

}
