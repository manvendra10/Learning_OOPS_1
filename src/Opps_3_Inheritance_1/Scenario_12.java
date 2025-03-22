package Opps_3_Inheritance_1;

public class Scenario_12 {
    public static void main(String[] args) {
        B b = new B();
    }
}

class A {
    public A () {
        System.out.println( " Printing -> A " );
    }
}

class B extends A {
    public B () {
        System.out.println( " Printing -> B " );
    }
}

class C extends B {
    public C () {
        System.out.println( " Printing -> C " );
    }
}
