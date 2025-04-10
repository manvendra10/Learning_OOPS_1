package Multithreading;

public class Ex_6_Number_printer implements Runnable {
    @Override
    public void run(){  // Task is the -> "the code u want to run" by a thread....
        // here the task is "printing 1 to 10"....each thread task is "printing 1 to 10"
        System.out.println( "starting a new thread -----> ");
        for( int i=1; i<=10; i++ ) {
            System.out.println( i + " " + Thread.currentThread().getName() );
        }
    }
}
