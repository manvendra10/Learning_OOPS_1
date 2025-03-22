package Opps_3_Inheritance_1;


public class Scenario_14 {
    public static void main(String[] args) {
        C4 c4 = new C4();
        D4 d4 = new D4();
        E4 e4 = new E4();
    }
}

class A4 {
    public A4 () {
        System.out.println( " Printing -> A4 " );
    }
}

class B4 extends A4 {
    public B4 () {
        System.out.println( " No arg constructor -> Printing -> B4 " );
    }
    public B4( String str ) {
        System.out.println( " Parameterised constructor with string -> B4 " + str );
    }
    public B4( int a ) {
        System.out.println( " Parameterised constructor with integer -> B4 " + a );
    }
}

class C4 extends B4 {
    public C4 () {
        System.out.println( " Printing -> C4 " );
    }
    /*
    Printing -> A4
    No arg constructor -> Printing -> B4
    Printing -> C4
     */
}

class D4 extends B4 {
    // super("hello"); // compilation error -> java: illegal start of type
    public D4 () {
        super( " hello...welcome "); // super is used....to call -> which constructor u want to call
        System.out.println( " Printing -> D4 " );
    }
    /*
    Printing -> A4
    Parameterised constructor with string -> B4  hello...welcome
    Printing -> D4

     */
}

class E4 extends B4 {
    // super("hello"); // compilation error -> java: illegal start of type
    public E4 () {
        super( 34 ); // super is used....to call -> which constructor u want to call
        System.out.println( " Printing -> E4 " );
        // -> error = Call to 'super()' must be first statement in constructor body. super() -> should always be the 1st line...
        //super( 34 ); // super is used....to call -> which constructor u want to call
    }
    /*
    Printing -> A4
    Parameterised constructor with integer -> B4 34
    Printing -> E4
     */
}

