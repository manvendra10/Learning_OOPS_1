package Opps_1_backend_project;
// A class is a blueprint. Since a blueprint don't store any data so a class also don't store any data
// no memory is allocated to a class
// we can start filling the data by objects.
// objects of a class can store the data and memory is allocated to the objects of a class.
public class Student {
    // class has 2 things -> attributes and behaviours
    // first -> age,psp,name are attributes
    int age;
    float psp;
    String name;
    // Behaviours or methods
    void changeBatch() {
        System.out.println( "changing the batch ");
    }
    void joinClass() {
        System.out.println( name + " is joining class ");
    }
    void printDetails() {
        System.out.println( "Name: " + name );
        System.out.println( "Age: " + age );
        System.out.println( "Psp: " + psp );
    }
}
