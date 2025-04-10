package Multithreading;

// 1. Create a class that implements the Runnable interface.
// 2. Override the run() method with the code you want to execute in a separate thread.
public class Ex_2_my_task implements Runnable {
    @Override
    public void run() {
        System.out.println( " I am in the new thread and thread name is = " +
                Thread.currentThread().getName() );
        for( int i=0; i<5; i++ ) {
            System.out.println( " Value of i = " + i );
        }
    }
}


// Ways to create a multithreading program:
// 1st way -> Implementing Runnable Interface
// 1. Create a class that implements the Runnable interface.
// 2. Override the run() method with the code you want to execute in a separate thread.
// 3. Create an instance of Thread, passing the Runnable object as an argument.
// 4. Start the thread using the start() method.