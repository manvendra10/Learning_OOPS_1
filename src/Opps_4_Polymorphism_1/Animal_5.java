package Opps_4_Polymorphism_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public interface Animal_5 {
    // private void eat(); // Error -> Private methods in interfaces should have a body // these are abstract method
    void eat(); // by default -> interface methods are public abstract method
    public abstract void walk(); // writing "public abstract" is optional -> Modifier 'abstract' is redundant for interface methods
    void run();

//    void play() { // error -> Interface abstract methods cannot have body
//
//    }

}

class dog implements Animal_5 { // dog is an animal  -> dog is child and animal is parent
    @Override
    public void eat() {
        System.out.println( " dog is eating ");
    }

    @Override
    public void walk() {
        System.out.println( " dog is walking ");
    }

    @Override
    public void run() {
        System.out.println( " dog is running ");
    }
}

class our_main_1 {
    public static void main(String[] args) {
        Animal_5 a = new dog();

        // List<Integer> l1 = new ArrayList<Integer>(); // List is parent interface and ArrayList is child implements it
        a.eat();
        a.walk();
        a.run();
        // you can not create object of the interface
        // Animal_5 a1 = new Animal_5(); // error -> 'Animal_5' is abstract; cannot be instantiated
        // a1.eat();
    }
}
