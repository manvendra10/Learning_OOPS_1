package Multithreading;

import java.util.Random;
import java.util.concurrent.Callable;

public class Ex_8_callable_random_number implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        System.out.println(" Thread name = " + Thread.currentThread().getName() );
        System.out.println(" In this thread, we are generating the random numbers ");
        int n = random.nextInt();
        Thread.sleep( 1000 * 20 ); // this will make this thread sleep for 1 sec * 20 = 20 sec
        System.out.println(" Random number is = " + n );
        return n;
    }
}
