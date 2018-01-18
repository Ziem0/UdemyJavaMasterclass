package Interfaces.Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Create a simple interface that allows an object to be saved to some sort of storage medium.
    // The exact type of medium is not known to the interface (nor to the classes that implement it).
    // The interface will just specify 2 methods, one to return an ArrayList of values to be saved
    // and the other to populate the object's fields from an ArrayList.
    //
    // Create some sample classes that implement your saveable interface (we've used the idea of a game,
    // with Players and Monsters, but you can create any type of classes that you want).
    //
    // Override the toString() method for each of your classes so that they can be easily printed to enable
    // the program to be tested easier.
    //
    // In Main, write a method that takes an object that implements the interface as a parameter and
    // "saves" the values.
    // We haven't covered I/O yet, so your method should just print the values to the screen.
    // Also in Main, write a method that restores the values to a saveable object.
    // Again, we are not going to use Java file I/O; instead use the readValues() method below to
    // simulate getting values from a file – this allows you to type as many values as your class
    // requires, and returns an ArrayList.


    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int idx = 0;

        System.out.println("Choose" +
                "\n\t 1 ---> to enter a string" +
                "\n\t 2 ---> to quit\n");

        while (!quit) {
            System.out.println("choose an option:\r");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    scanner.nextLine();
                    String stringInput = scanner.nextLine();
                    values.add(idx, stringInput);
                    idx++;
                    break;
            }
        }
        return values;
    }


    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving "+ objectToSave.write().get(i) + " to storage");
        }
    }


    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);

    }

    public static void main(String[] args) {
        Player ziemo = new Player("Ziemo", 100, "Sword");
        System.out.println(ziemo);
        saveObject(ziemo);

        ziemo.setWeapon("Fist");
        System.out.println(ziemo);
        saveObject(ziemo);

        loadObject(ziemo);
        System.out.println(ziemo);
    }
}
