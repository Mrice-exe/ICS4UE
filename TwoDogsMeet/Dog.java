/*
Sean S
03/16/2025
ICS4UE 
Unit 3: Modular Programming
Activity 2: Modifying Modules
TwoDogsMeet

The purpose of this code is to create three different cars, each using a different constructor, 
properties specified by the user.

Variable dictionary:
    name: String variable that stores the name of the dog.
    breed: String variable that stores the breed of the dog.
    age: Integer variable that stores the age of the dog (randomly assigned between 1-10).
    aggression: Integer variable that stores the aggression value of the dog (randomly assigned between 1-10).
    hunger: Integer variable that stores the hunger value of the dog (randomly assigned between 1-10).
    rand: Random object used to generate random values for age, aggression, and hunger.
    interactionValue: Integer variable used to calculate the total value for determining the dog's interaction during the meeting.
        
*/
package TwoDogsMeet;

public class Dog {
    private String name, breed;
    private int age, aggression, hunger;

    // Constructor to initialize the dog's name and breed and assign random age, aggression, and hunger values
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        Random rand = new Random();
        this.age = rand.nextInt(10) + 1; // Random age between 1 and 10
        this.aggression = rand.nextInt(10) + 1; // Random aggression between 1 and 10
        this.hunger = rand.nextInt(10) + 1; // Random hunger between 1 and 10
    }

    // Set the aggression value
    public void setAggression(int aggression) {
        this.aggression = aggression;
    }

    // Set the hunger value
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    // Method to output the dog details
    public String toString() {
        return "Name: " + name + "\nBreed: " + breed + "\nAge: " + age + "\nAggression: " + aggression + "\nHunger: " + hunger;
    }

    // Method to simulate a meeting between two dogs
    public String meet(Dog other) {
        int interactionValue = this.aggression + this.hunger + other.aggression + other.hunger;
        if (interactionValue < 20) {
            return "The dogs had a friendly meeting!";
        } else if (interactionValue < 30) {
            return "The dogs had a neutral meeting.";
        } else {
            return "The dogs had an aggressive meeting!";
        }
    }
}
