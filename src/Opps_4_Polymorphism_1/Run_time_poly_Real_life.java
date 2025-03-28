package Opps_4_Polymorphism_1;

import java.util.Random;
import java.util.Scanner;

public class Run_time_poly_Real_life {
    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in );
        for( int i=0; i<3; i++ ) {
            User our_user = getObj();
            System.out.println( " please input the user name...");
            String str = scn.nextLine();
            our_user.setName( str );
            our_user.login();
            /*
            // if there is no runtime polymorphism in this world...then...we will write the code like this
            if( our_user instanceof Student ) {
                // trigger the user login
                our_user.login();
            }
            else if( our_user instanceof Instructor ) {
                // trigger the instructor login
                our_user.login();
            }
            */
        }
    }

    public static User getObj() {
        Random r = new Random();
        int random = r.nextInt();
        if( random %2 == 0 ) {
            return new Student();
        }
        return new Instructor();
    }

}

class User {
    String name;
    String password;
    void login() {
        System.out.println( " the user is logging in " + name );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Instructor extends User {
    @Override
    void login() {
        System.out.println( " Instructor user is trying to logging in " + name );
    }
}

class Student extends User {
    @Override
    void login() {
        System.out.println( " Student user is trying to logging in " + name );
    }
}