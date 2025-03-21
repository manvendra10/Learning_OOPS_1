package Opps_2_Constructor_1;

public class Constructor_Demo {
    public static void main(String[] args) {
        // default constructor is called...when no constructor is written...
        // In case any constructor is written...then default java constructor is not called
        // In such a case, we have to write our own " No args constructor "
        Animal a = new Animal(); // default constructor can not be called.....No args constructor is called
        System.out.println( " default name = " + a.name );
        System.out.println( " default age = " + a.age);
        System.out.println( " default breed = " + a.breed );

        // Parameterized constructor
        Animal b = new Animal( "cat");
        System.out.println( " default name = " + b.name );
        System.out.println( " default age = " + b.age);
        System.out.println( " default breed = " + b.breed );

        // Parameterized constructor
        Animal c = new Animal( 23,"zebra like breed");
        System.out.println( " default name = " + c.name );
        System.out.println( " default age = " + c.age);
        System.out.println( " default breed = " + c.breed );

        // Parameterized constructor
        Animal d = new Animal( "elephant Mahadev","elephant like breed");
        System.out.println( " default name = " + d.name );
        System.out.println( " default age = " + d.age);
        System.out.println( " default breed = " + d.breed );
    }
}
