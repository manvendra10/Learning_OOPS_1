package Opps_4_Polymorphism_1;

import java.util.List;

public class user_1 {
    public String user_name;
    public static void print_name( List<user_1> users, String user_name ) {
        for( user_1 u : users ) {
            System.out.println( " current hashcode is = " + u );
            System.out.println(" From user class -> user_name = " + user_name );
        }
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