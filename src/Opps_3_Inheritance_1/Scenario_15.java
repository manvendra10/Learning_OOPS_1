package Opps_3_Inheritance_1;


public class Scenario_15 {
    public static void main(String[] args) {
        C5 c5 = new C5();
    }
}

class A5 {
    public A5 () {
        System.out.println( " Printing -> A5 " );
    }
}

class B5 extends A5 {

    public B5( String str ) {
        System.out.println( " Parameterised constructor with string -> B5 " + str );
    }
    public B5( int a ) {
        System.out.println( " Parameterised constructor with integer -> B5 " + a );
    }
}

class C5 extends B5 {
    public C5 () {
        super( " i am here ");
        System.out.println( " Printing -> C5 " );
    }
    /*
    Printing -> A5
    Parameterised constructor with string -> B5  i am here
    Printing -> C5
     */
}

/*
when u want to use, a specific constructor of your parent -> then u use " super" keyword.
 */