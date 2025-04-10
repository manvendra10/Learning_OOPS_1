package Multithreading;

public class Ex_5_Number_printer implements Runnable {
        @Override
        public void run(){
            System.out.println( "starting a new thread -----> ");
            for( int i=1; i<=10; i++ ) {
                System.out.println( i + " " + Thread.currentThread().getName() );
            }
        }
}
