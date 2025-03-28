package Opps_4_Polymorphism_1;

public class Run_time_poly_scenario_4 {

    public static void main(String[] args) {
        xx obj = new zz();
        obj.print(); // Printing -> zz

        obj = new yy();
        obj.print();
        // Printing -> xx
        // Printing -> yy

        obj = new xx();
        obj.print(); // Printing -> xx
    }
}

class xx {
    public void print() {
        System.out.println( " Printing -> xx ");
    }
}


class yy extends xx{
    public void print() {
        super.print();
        System.out.println( " Printing -> yy ");
    }
}

class zz extends yy {
    public void print() {
        System.out.println( " Printing -> zz ");
    }
}