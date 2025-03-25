package Opps_4_Polymorphism_1;

import java.util.List;

import static Opps_4_Polymorphism_1.user_1.print_name;

public class demo_1 {
    public static void main(String[] args) {
        List<user_1> u = List.of( new user_1(), new instructor_1(), new mentor_1() );
        print_name( u, "manvendra" );
    }
}

/*
1. Polymorphism allows us to hold the object of the child in a variable
of the parent class.
2. A variable of type parent can hold the object of the child

// Instructor is a user [ user is parent class and Instructor is child class ]
user_1 u = new instructor_1();

// Mentor is a user [ user is parent class and Mentor is child class ]
user_1 u = new mentor_1();

// Normal thing
user_1 u = new user_1();
 */
