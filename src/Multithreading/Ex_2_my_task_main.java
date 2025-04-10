package Multithreading;

// 3. Create an instance of Thread, passing the Runnable object as an argument.
// 4. Start the thread using the start() method.
public class Ex_2_my_task_main {
    public static void main(String[] args) {
        // Create an instance of Thread, passing the Runnable object as an argument.
        Thread t1 = new Thread( new Ex_2_my_task() ); // Pass Runnable object to Thread
        t1.start();
    }
}


// Ways to create a multithreading program:
// 1st way -> Implementing Runnable Interface
// 1. Create a class that implements the Runnable interface.
// 2. Override the run() method with the code you want to execute in a separate thread.
// 3. Create an instance of Thread, passing the Runnable object as an argument.
// 4. Start the thread using the start() method.