/*
Sean S
03/02/2025
ICS4UE 
Unit 2: Arrays
Activity 2: One-Dimensional Arrays
Eratosthenes

Variable dictionary:
    phrase - stores the String input of user
    rotation - stores the int desired rotation
    enOrDie - stores the int value of 1 or 2 from the user input deciding encryption or decryption
    encrypted - the string that holds the encrypted phrase
    decrypted - the string that holds the decrypted phrase
    current - the current character the for loop is on
    base - the uppercase A which has a specified ascii value
    newchar - is the new character after the rotation calculated from a formula
    
*/
import java.util.ArrayList;  // Import the ArrayList class

class Eratosthenes {
    public static void main(String[] args) {
        //This program will use a dynamic arrays
    ArrayList<String> nouns = new ArrayList<String>();
    nouns.add("cat");
    nouns.add("dog");
    nouns.add("horse");
    nouns.add("goat");
    nouns.add("eagle");
    nouns.add("lion");
    nouns.add("giraffe");

    ArrayList<String> verbs = new ArrayList<String>();
    verbs.add("ate");
    verbs.add("slept");
    verbs.add("jumped");
    verbs.add("raced");
    verbs.add("ran");
    verbs.add("tripped");
    verbs.add("guessed");
    verbs.add("tapped");

    ArrayList<String> rhymingNouns = new ArrayList<String>();
    rhymingNouns.add("mouse");
    rhymingNouns.add("blouse");
    rhymingNouns.add("grouse");
    rhymingNouns.add("house");
    rhymingNouns.add("spouse");
    rhymingNouns.add("doghouse");
    rhymingNouns.add("beachhouse");
    rhymingNouns.add("treehouse");

    String noun;
    String verb1, verb2, verb3;
    String rhymingNoun1, rhymingNoun2, rhymingNoun3;
    int randomNum;

    //get a random noun from the nouns array
    //use .size() to get the # of elements
    randomNum = (int) (Math.random() * nouns.size());
    noun = nouns.get(randomNum);

    //get the first random verb from the verbs array &
    // remove from ArrayList
    randomNum = (int) (Math.random() * verbs.size());
    verb1 = verbs.get(randomNum);
    verbs.remove(randomNum);

    //get the second random verb from verbs array and remove it
    randomNum = (int) (Math.random() * verbs.size());
    verb2 = verbs.get(randomNum);
    verbs.remove(randomNum);
    
    //get the third random verb from verbs array and remove it
    randomNum = (int) (Math.random() * verbs.size());
    verb3 = verbs.get(randomNum);
    verbs.remove(randomNum);

    //get the first rhyming noun and remove it
    randomNum = (int) (Math.random() * rhymingNouns.size());
    rhymingNoun1 = rhymingNouns.get(randomNum);
    rhymingNouns.remove(randomNum);

    //get the second rhyming noun and remove it
    randomNum = (int) (Math.random() * rhymingNouns.size());
    rhymingNoun2 = rhymingNouns.get(randomNum);
    rhymingNouns.remove(randomNum);
    
    //get the third rhyming noun and remove it
    randomNum = (int) (Math.random() * rhymingNouns.size());
    rhymingNoun3 = rhymingNouns.get(randomNum);
    rhymingNouns.remove(randomNum);
    //Display the poem
    System.out.println("The " + noun + " " + verb1 + " a " + 
      rhymingNoun1 + "\n" + "And then " + verb2 + 
      " in the " + rhymingNoun2 + "\n" + "But it " + verb3 + 
      " a " + rhymingNoun3);
  }
}
