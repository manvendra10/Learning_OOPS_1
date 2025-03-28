package Opps_4_Polymorphism_1;

public class Run_time_poly_scenario_3 {
    public static void main(String[] args) {
        x obj = new z();
        obj.print(); // Printing -> z

        obj = new y();
        obj.print(); // Printing -> x

        obj = new x();
        obj.print(); // Printing -> x
    }
}

class x {
    public void print() {
        System.out.println( " Printing -> x ");
    }
}


class y extends x{
//    public void print() {
//        System.out.println( " Printing -> y ");
//    }
}

class z extends y {
    public void print() {
        System.out.println( " Printing -> z ");
    }
}