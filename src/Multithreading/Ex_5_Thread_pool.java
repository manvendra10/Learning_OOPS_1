
package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex_5_Thread_pool {
    public static void main(String[] args) {
        // we want to execute this logic as a part of the thread
        Ex_5_Number_printer np = new Ex_5_Number_printer();
        // old way of creating the thread and starting the thread
        // Thread thread = new Thread( np );
        // thread.start();
        ExecutorService es = Executors.newFixedThreadPool( 2 );
        for( int i=1; i<=5; i++ ) {
            es.execute( np ); // there are 2 threads and there are 5 task to be done
        }
        // once the job is done -> then u shutdown the thread pool. otherwise threads keep on waiting for more tasks
        es.shutdown();
    }
}