package org.example;

public class Main {

    // Instance variables
    private int myNumber;
    private String myString;

    // Default Constructor (no arguments)
    public Main() {
        // This is a default constructor with no arguments
        // You can initialize default values here
        myNumber = 0;
        myString = "Default";
    }

    // Constructor with parameters
    public Main(int number, String str) {
        // This constructor takes two arguments
        // and sets the instance variables accordingly
        myNumber = number;
        myString = str;
    }

    // Getter methods (optional, for accessing private variables)
    public int getMyNumber() {
        return myNumber;
    }

    public String getMyString() {
        return myString;
    }

    // Setter methods (optional, for modifying private variables)
    public void setMyNumber(int number) {
        myNumber = number;
    }

    public void setMyString(String str) {
        myString = str;
    }

    public static void main(String[] args) {
        // Creating objects using constructors
        Main obj1 = new Main(); // Using the default constructor
        Main obj2 = new Main(42, "Hello"); // Using the parameterized constructor

        // Accessing instance variables
        System.out.println("obj1: " + obj1.getMyNumber() + ", " + obj1.getMyString());
        System.out.println("obj2: " + obj2.getMyNumber() + ", " + obj2.getMyString());
    }
}
