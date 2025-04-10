package Multithreading;

public class Ex_3_odd_printer implements Runnable {
    @Override
    public void run() {
        for( int i = 0; i < 20; i++ ) {
            if( i % 2 == 1 ) {
                System.out.println(" Odd thread : Name is = " + Thread.currentThread().getName() );
                System.out.println(" Odd thread : value of i = " + i );
            }
        }
    }
}
