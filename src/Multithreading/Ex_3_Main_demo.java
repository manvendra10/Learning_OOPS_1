package Multithreading;

public class Ex_3_Main_demo {
    public static void main(String[] args) {
        Ex_3_odd_printer op = new Ex_3_odd_printer();
        Ex_3_even_printer ep = new Ex_3_even_printer();
        Thread t1_odd = new Thread( op );
        Thread t2_even = new Thread( ep );
        t1_odd.start();
        t2_even.start();

    }

}
