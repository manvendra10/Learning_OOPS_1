package Multithreading;

public class Ex_1_Basic_thread_main_demo {
    public static void main(String[] args) {
        Ex_1_BasicThread basic_thread = new Ex_1_BasicThread();
        // Runnable r = new BasicThread();
        Thread t1 = new Thread( basic_thread ); // public Thread(Runnable task) {...} ----> "task" is the object whose run method is invoked when this thread is started
        t1.start();
        // t1.run(); //  Does not start a new thread; it simply runs the method in the same thread as the caller.
        System.out.println( " this is main thread and the proof is, the thread name is = " +
                Thread.currentThread().getName() );

    }
}
