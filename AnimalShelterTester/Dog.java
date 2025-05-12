/*
Sean S
05/11/2025
ICS4UE 
Unit 6: Introduction to Object-Oriented Programming
Activity 3: Composition
AnimalShelterTester

Variable dictionary:
    dogName – a String storing the name of the dog
    dogBreed – a String storing the breed of the dog
    age – an integer storing the age of the dog (random 1–10 if not specified)
    weight – an integer storing the weight of the dog in pounds (random 20–50 if not specified)
    dgName – a parameter for the dog's name in the constructor
    dgBreed – a parameter for the dog's breed in the constructor
    ag – a parameter for the dog's age in the constructor
    weig – a parameter for the dog's weight in the constructor
    output – a String used to assemble the dog's description in toString()
*/
package AnimalShelterTester;

public class Dog {
    //variables for characteristics

  private String dogName, dogBreed;
  private int age, weight;

  //constructors
  public Dog() {
    dogName = "Rufus Doe";
    dogBreed = "Unknown Breed";
    age = 0;
    weight = 0;
  }

  public Dog(String dgName, String dgBreed, int ag, int weig) {
    dogName = dgName;
    dogBreed = dgBreed;
    age = ag;
    weight = weig;
  }

  //Alternate constructor
  public Dog(String dgName, String dgBreed) {
    //This constructor only uses the name and breed
    //Set the age and weight to random #s

    dogName = dgName;
    dogBreed = dgBreed;
    age = (int) (Math.random() * 10) + 1;
    weight = (int) (Math.random() * 31) + 20;
  }

  public void barkFriendly() {
    System.out.println("Arf! Arf!");
  }

  public void barkAngry() {
    System.out.println("GRR! RRRFFF!");
  }

  //method to display all info of the Dog
  public String toString() {
    String output = "Name: " + dogName + "\n";
    output += "Breed: " + dogBreed + "\n";
    output += "Age: " + age + "\n";
    output += "Weight: " + weight;
    //output string is complete, return it
    return output;
    }
}
