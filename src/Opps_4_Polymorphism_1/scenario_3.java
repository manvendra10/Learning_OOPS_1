package Opps_4_Polymorphism_1;

class AA { // class AA -> has access to variables aa,bb only
    int aa,bb;
    void printing_in_AA() { // class AA -> has access to methods printing_in_AA()
        System.out.println( " We are printing in class AA ");
    }
}

class BB extends AA { // class BB -> has access to variables aa,bb,cc only
    int cc;
    void printing_in_BB() { // class BB -> has access to methods printing_in_AA(),printing_in_BB()
        System.out.println( " We are printing in class BB ");
    }
}
class CC extends BB { // class CC -> has access to variables aa,bb,cc,dd only
    int dd;
    void printing_in_CC() { // class CC -> has access to methods printing_in_AA(),printing_in_BB(),printing_in_CC()
        System.out.println( " We are printing in class CC ");
    }
}

public class scenario_3 {
    public static void main(String[] args) {
        System.out.println( "output for AA obj = new CC(); ");
        AA obj = new CC();
        System.out.println( "obj.aa = " + obj.aa );
        System.out.println( "obj.bb = " + obj.bb );
        // System.out.println( "obj.cc = " + obj.cc ); // error -> java: cannot find symbol  symbol:   variable cc
        // System.out.println( "obj.dd = " + obj.dd ); // error -> java: cannot find symbol  symbol:   variable dd
        obj.printing_in_AA();
        // obj.printing_in_BB();    // Cannot resolve method 'printing_in_BB' in 'AA'
        // obj.printing_in_CC();    // Cannot resolve method 'printing_in_CC' in 'AA'

        System.out.println( "output for CC obj0 = new CC(); AA obj11 = obj0; -> which is same as A obj = new C(); ");
        CC obj0 = new CC();
        AA obj11 = obj0; // these 2 lines are same as " A obj = new C(); "
        System.out.println( "obj11.aa = " + obj11.aa );
        System.out.println( "obj11.bb = " + obj11.bb );
        // System.out.println( "obj11.cc = " + obj11.cc ); // error -> java: cannot find symbol  symbol:   variable cc
        // System.out.println( "obj11.dd = " + obj11.dd ); // error -> java: cannot find symbol  symbol:   variable dd
        obj11.printing_in_AA();
        // obj11.printing_in_BB();    // Cannot resolve method 'printing_in_BB' in 'AA'
        // obj11.printing_in_CC();    // Cannot resolve method 'printing_in_CC' in 'AA'


        System.out.println( "output for AA obj1 = new BB(); ");
        AA obj1 = new BB();
        System.out.println( "obj1.aa = " + obj1.aa );
        System.out.println( "obj1.bb = " + obj1.bb );
        // System.out.println( "obj1.cc = " + obj1.cc ); // error -> java: cannot find symbol  symbol:   variable cc
        // System.out.println( "obj1.dd = " + obj1.dd ); // error -> java: cannot find symbol  symbol:   variable dd
        obj1.printing_in_AA();
        // obj1.printing_in_BB();    // Cannot resolve method 'printing_in_BB' in 'AA'
        // obj1.printing_in_CC();    // Cannot resolve method 'printing_in_CC' in 'AA'


        System.out.println( "output for BB obj2 = new CC(); ");
        BB obj2 = new CC();
        System.out.println( "obj2.aa = " + obj2.aa );
        System.out.println( "obj2.bb = " + obj2.bb );
        System.out.println( "obj2.cc = " + obj2.cc );
        // System.out.println( "obj1.dd = " + obj2.dd ); // error -> java: cannot find symbol  symbol:   variable dd
        obj2.printing_in_AA();
        obj2.printing_in_BB();
        // obj2.printing_in_CC();    // Cannot resolve method 'printing_in_CC' in 'BB'


        System.out.println( "output for CC obj3 = new CC(); ");
        CC obj3 = new CC();
        System.out.println( "obj3.a = " + obj3.aa );
        System.out.println( "obj3.b = " + obj3.bb );
        System.out.println( "obj3.c = " + obj3.cc );
        System.out.println( "obj3.d = " + obj3.dd );
        obj3.printing_in_AA();
        obj3.printing_in_BB();
        obj3.printing_in_CC();
    }
}

/*
1. Parent class variable can hold the object of the child.
2. But, Parent class variable is allowed to access only the parent class attributes/data members.
3. But, Parent class variable is allowed to access only the parent class methods/Behaviours.
3. In other words, Parent class variable is not allowed to access the child class  attributes/data members.
4. Parent class variable is not allowed to access the child class methods/Behaviours.
 */