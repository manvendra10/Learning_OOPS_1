package Multithreading;

import java.util.Random;
import java.util.concurrent.Callable;

public class Ex_7_callable_random_number implements Callable<Integer> {
    @Override
    public Integer call() {
        Random random = new Random();
        System.out.println(" Thread name = " + Thread.currentThread().getName() );
        System.out.println(" In this thread, we are generating the random numbers ");
        int n = random.nextInt();
        System.out.println(" Random number is = " + n );
        return n;
    }
}
