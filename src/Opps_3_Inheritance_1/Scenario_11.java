package Opps_3_Inheritance_1;

public class Scenario_11 {
    public static void main(String[] args) {
        C2 c2 = new C2();
    }
}

class A2 {
    public A2 () {
        System.out.println( " Printing -> A2 " );
    }
}

class B2 extends A2 {
    public B2 () {
        System.out.println( " Printing -> B2 " );
    }
}

class C2 extends B2 {
    public C2 () {
        System.out.println( " Printing -> C2 " );
    }
}