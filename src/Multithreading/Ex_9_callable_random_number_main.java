package Multithreading;

import java.util.Timer;
import java.util.concurrent.*;

public class Ex_9_callable_random_number_main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool( 1 );
        Ex_8_callable_random_number rng = new Ex_8_callable_random_number();
        Future<Integer> fi = es.submit( rng );
        System.out.println( " Main thread is doing any other tasks.... ");
        // int our_random_number = fi.get( 5, TimeUnit.SECONDS ); // this is what we actually wanted to write...
        // it will give exception since timeout will happen at 5 secs....
        int our_random_number = fi.get( );
        System.out.println(" In Main() random number = " + our_random_number );
        es.shutdown();
    }
}

