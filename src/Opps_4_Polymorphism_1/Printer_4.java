package Opps_4_Polymorphism_1;

class My_printing {
    void print4( ) {
        System.out.println( " Hello....u are inside function print4() ");
    }
    void print4( String name ) {
        System.out.println( " Hello " + name + "...u are inside function print4( String name ) ");
    }
    /*
    // we don't consider return type in method signature...
    String print4( String name ) { // java: method print4(java.lang.String) is already defined in class Opps_4_Polymorphism_1.My_printing
        System.out.println( " Hello " + name + "...u are inside function print4( String name ) ");
    }
    */
    void print4( String name, int a ) {
        System.out.println( " Hello " + name +" having value = "+ a + "...u are inside function print4( String name, int a ) ");
    }

}

public class Printer_4 {
    public static void main(String[] args) {
        My_printing p = new My_printing();
        p.print4();
        p.print4( " manvendra ");
        p.print4(" shalini ", 786 );

    }
}