package Multithreading;

public class Ex_4_Number_printer implements Runnable {
    @Override
    public void run(){
        for( int i=0; i<100; i++ ) {
            System.out.println( i + " " + Thread.currentThread().getName() );
        }
    }
}

