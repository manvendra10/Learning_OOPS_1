package Opps_3_Inheritance_1;

public class Scenario_13 {
    public static void main(String[] args) {
        C3 c3 = new C3();
    }
}

class A3 {
    public A3 () {
        System.out.println( " Printing -> A3 " );
    }
}

class B3 extends A3 {
    // private B3 () { // compilation error -> java: B3() has private access in Opps_3_Inheritance_1.B3
    // entire...inheritance chain is broken....so we can not create object of C
    public B3 () {
        System.out.println( " Printing -> B3 " );
    }
}

class C3 extends B3 {
    public C3 () {
        System.out.println( " Printing -> C3 " );
    }
}

