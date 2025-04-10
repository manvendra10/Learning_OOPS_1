package Multithreading;

public class Ex_3_even_printer implements Runnable {
    @Override
    public void run() {
        for( int i =0; i<20; i++ ) {
            if( i % 2 == 0 ) {
                System.out.println( " Even thread - name is  = " + Thread.currentThread().getName() );
                System.out.println( " Even Thread : value of i = " + i );
            }
        }
    }
}
