package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex_4_Thread_pool {
    public static void main(String[] args) {
        // we want to execute this logic as a part of the thread
        Ex_4_Number_printer np = new Ex_4_Number_printer();
        // old way of creating the thread and starting the thread
        // Thread thread = new Thread( np );
        // thread.start();
        ExecutorService es = Executors.newFixedThreadPool( 10 );
        es.execute( np ); // there are 10 thread and there is only 1 task to be done
        // once the job is done -> then u shutdown the threadpool. otherwise threads keep on waiting for more tasks
        es.shutdown();
    }
}
