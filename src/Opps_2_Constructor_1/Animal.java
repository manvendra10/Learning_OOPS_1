package Opps_2_Constructor_1;

public class Animal {
    public String name;
    public int age;
    public String breed;

    // No args constructor
    // With No args constructor....user can give his own default values
    // when user writes his own No args constructor....then java's own default constructor don't come in picture
    public Animal() {
        name = "dog";
        age = 1;
        breed = "puppy like breed";
    }
    // A class can have more than 1 constructors....now it is parameterised constructor..
    public Animal( String name ) {
        this.name = name;
    }
    // Parameterized constructor...should have unique signature( no of arguments and type of arguments should be different )
    public Animal( int age, String breed ) {
        this.age = age;
        this.breed = breed;
    }
    // Parameterized constructor...should have unique signature( no of arguments and type of arguments should be different )
    public Animal( String name, String breed ) {
        this.name = name;
        this.breed = breed;
    }

}
