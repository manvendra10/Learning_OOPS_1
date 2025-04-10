
package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex_6_Thread_pool_safe {

    // we are doing " this creation of thread pool and threads" at the class level
    // if the frontend api sends the 1 million requests then -> still we create only 2 threads
    static ExecutorService es = Executors.newFixedThreadPool( 2 );

    public static void main(String[] args) {
        // we want to execute this logic as a part of the thread
        // Task is the -> "the code u want to run" by a thread....
        Ex_6_Number_printer np = new Ex_6_Number_printer();
        // old way of creating the thread and starting the thread
        // Thread thread = new Thread( np );
        // thread.start();

        for( int i=1; i<=5; i++ ) {
            es.execute( np ); // there are 2 threads and there are 5 task to be done
        }
        // once the job is done -> then u shutdown the thread pool. otherwise threads keep on waiting for more tasks
        es.shutdown();
    }
}
