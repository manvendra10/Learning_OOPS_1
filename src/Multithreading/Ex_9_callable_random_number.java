package Multithreading;

import java.util.Random;
import java.util.concurrent.Callable;

public class Ex_9_callable_random_number implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        System.out.println(" Thread name = " + Thread.currentThread().getName() );
        System.out.println(" In this thread, we are generating the random numbers ");
        int n = random.nextInt();
        Thread.sleep( 1000 * 10 ); // this will make this thread sleep for 1 sec * 10 = 10 sec
        System.out.println(" Random number is = " + n );
        return n;
    }
}
