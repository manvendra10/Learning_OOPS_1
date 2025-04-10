package Multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Basic code for Callable
public class Ex_7_callable_random_number_main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool( 1 );
        Ex_7_callable_random_number rng = new Ex_7_callable_random_number();
        Future<Integer> fi = es.submit( rng ); // task is submitted to a thread pool
        System.out.println( " Main thread is doing any other tasks.... ");
        int our_random_number = fi.get();
        System.out.println(" In Main() random number = " + our_random_number );
    }
}
