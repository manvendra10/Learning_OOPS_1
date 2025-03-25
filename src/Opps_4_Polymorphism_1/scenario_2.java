package Opps_4_Polymorphism_1;

class A { // class A -> has access to variables a,b only
    int a,b;
}

class B extends A { // class B -> has access to variables a,b,c only
    int c;
}
class C extends B { // class A -> has access to variables a,b,c,d only
    int d;
}

public class scenario_2 {
    public static void main(String[] args) {
        System.out.println( "output for A obj = new C(); ");
        A obj = new C();
        System.out.println( "obj.a = " + obj.a );
        System.out.println( "obj.b = " + obj.b );
        // System.out.println( "obj.c = " + obj.c ); // error -> java: cannot find symbol  symbol:   variable c
        // System.out.println( "obj.d = " + obj.d ); // error -> java: cannot find symbol  symbol:   variable d

        System.out.println( "output for C obj0 = new C(); A obj11 = obj0; -> which is same as A obj = new C(); ");
        C obj0 = new C();
        A obj11 = obj0; // these 2 lines are same as " A obj = new C(); "
        System.out.println( "obj11.a = " + obj11.a );
        System.out.println( "obj11.b = " + obj11.b );
        // System.out.println( "obj11.c = " + obj11.c ); // error -> java: cannot find symbol  symbol:   variable c
        // System.out.println( "obj11.d = " + obj11.d ); // error -> java: cannot find symbol  symbol:   variable d

        System.out.println( "output for A obj1 = new B(); ");
        A obj1 = new B();
        System.out.println( "obj1.a = " + obj1.a );
        System.out.println( "obj1.b = " + obj1.b );
        // System.out.println( "obj1.c = " + obj1.c ); // error -> java: cannot find symbol  symbol:   variable c
        // System.out.println( "obj1.d = " + obj1.d ); // error -> java: cannot find symbol  symbol:   variable d

        System.out.println( "output for B obj2 = new C(); ");
        B obj2 = new C();
        System.out.println( "obj2.a = " + obj2.a );
        System.out.println( "obj2.b = " + obj2.b );
        System.out.println( "obj2.c = " + obj2.c );
        // System.out.println( "obj1.d = " + obj2.d ); // error -> java: cannot find symbol  symbol:   variable d

        System.out.println( "output for C obj3 = new C(); ");
        C obj3 = new C();
        System.out.println( "obj3.a = " + obj3.a );
        System.out.println( "obj3.b = " + obj3.b );
        System.out.println( "obj3.c = " + obj3.c );
        System.out.println( "obj3.d = " + obj3.d );
    }
}

/*
1. Parent class variable can hold the object of the child.
2. But, Parent class variable is allowed to access only the parent class attributes/data members.
3. In other words, Parent class variable is not allowed to access the child class  attributes/data members.
 */






