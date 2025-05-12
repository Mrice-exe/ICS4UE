/*
Sean S
05/11/2025
ICS4UE 
Unit 6: Introduction to Object-Oriented Programming
Activity 3: Composition
AnimalShelterTester

Variable dictionary:
    shelterDogs – an array of Dog objects representing the dogs in the shelter
    name – a String storing the name of a newly added dog
    breed – a String storing the breed of a newly added dog
    addedDog – a Dog object that is created and added to the shelter
    temp – a temporary array used to resize shelterDogs when adding or removing a dog
    cost – an integer storing the total operating cost (number of dogs × $15)
    output – a String used to build the shelter summary for display
*/
package AnimalShelterTester;

import javax.swing.*;
public class AnimalShelter {
    //The Animal Shelter will contain dogs stored in an array

    private Dog shelterDogs[];

    public AnimalShelter(){
        shelterDogs = new Dog[0]; // Initialize with an empty array
    }
    public void addADog(String dName, String dBreed){
        String name = dName;
        String breed = dBreed;
        Dog addedDog = new Dog(name,breed);
        Dog[] temp = new Dog[shelterDogs.length + 1];
        for (int i = 0; i < shelterDogs.length; i++) {
            temp[i] = shelterDogs[i];
        }
        temp[shelterDogs.length] = addedDog;
        shelterDogs = temp;
        System.out.println("Added Dog #"+ shelterDogs.length);
    }
    public void removeADog(){
        Dog[] temp = new Dog[shelterDogs.length - 1];
        for (int i = 0; i < shelterDogs.length - 1; i++){
            temp[i] = shelterDogs[i];
        }
        System.out.println("Removed Dog #" + shelterDogs.length);
        shelterDogs = temp;
    }
    public void countCost(){
        int cost = shelterDogs.length *15;
        System.out.println("Cost: $"+cost);
    }
    public String toString(){
        String output = "";
        output += "Animal Shelter Contains: \n";
        //print each dog
        for (int i = 0; i < shelterDogs.length; i++){
            output += "Dog #" + i + "\n";
            output += shelterDogs[i].toString() + "\n";
        }
        return output;
    }

}
