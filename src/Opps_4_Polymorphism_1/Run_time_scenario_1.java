package Opps_4_Polymorphism_1;

public class Run_time_scenario_1 {
    public static void main(String[] args) {
        A4 obj1 = new C4();
        obj1.print(); // Printing from -> C4
        // obj1.printing_name( "manvendra" ); //Cannot resolve method 'printing_name' in 'A4'

        obj1 = new B4();
        obj1.print(); // Printing from -> B4

        obj1 = new A4();
        obj1.print(); // Printing from -> A4

        /*
        Final Output ->
        Printing from -> C4
        Printing from -> B4

         */
    }

}

class A4 {
    public void print() {
        System.out.println( " Printing from -> A4 ");
    }
}

class B4 extends A4 {
    public void print() {
        System.out.println( " Printing from -> B4 ");
    }
}


class C4 extends B4 {
    public void print() {
        System.out.println( " Printing from -> C4 ");
    }
    public void printing_name( String s ) {
        System.out.println( " my name is  = " + s );
    }
}


