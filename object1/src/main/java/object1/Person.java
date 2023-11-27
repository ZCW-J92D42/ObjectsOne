package object1;

// Define a class
public class Person {
    public String name;
    public int age = 0;
    public int height; // units are "centimeters"

    // Constructor
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
