package Opps_4_Polymorphism_1;

import java.util.Random;

public class Run_time_poly_scenario_2 {
    public static void main(String[] args) {
        for( int i=0; i<5; i++ ) {
            D object = getObj();
            object.print();
        }


    }
    public static D getObj() {
        Random r = new Random();
        int random = r.nextInt();
        System.out.println(" current random number is = " + random );
        if( random % 3 == 0 ) {
            return new D();
        }
        else if( random % 3 == 1 ) {
            return new E();
        }
        return new F();
    }
}

class D {
    void print() {
        System.out.println( " printing -> D ");
    }
}

class E extends D {
    void print() {
        System.out.println( " printing -> E ");
    }
}

class F extends E {
    void print() {
        System.out.println( " printing -> F ");
    }
}