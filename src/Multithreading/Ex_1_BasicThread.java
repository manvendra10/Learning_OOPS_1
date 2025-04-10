package Multithreading;

public class Ex_1_BasicThread implements Runnable {
    @Override
    public void run() {
        System.out.println(" I am in a new thread...the thread name is = " +
                Thread.currentThread().getName() );
    }
}
