package MultiThreading;

/*
 * MultiThreading is a very important concept by which
 *  we can save CPU cycle from being waste by assigning it with other process
 */
/**
 * THread: Very lightweight process smallest part of process allows program to
 * run efficiently by running different processes simultaneously.
 * We can visualize Thread as a Line Of Execution which goes through different
 * programs one
 * after another.....IF we only have one thread means we will only have one line
 * of execution
 * which will take longer time to execute multiple processes because it will
 * wait for a
 * individual process to execute completely before moving to other process.
 * With MultiTHreading we can create multiple line of executions which will
 * execute every process
 * individually and make our overall code faster for execution.
 * 
 */

/*
 * Thread Scheduler : IF multiple threads are waiting to execute then which
 * thread will execute 1st is decided by thread scheduler which is a part of JVM
 * . In cas4e of multiThreading we can't predict the exact output , only
 * possible output we can expect.
 */

/*
 * run() method : THe run() method is available in the thread class constructed
 * using a seperate Runnable onject. Otherwise , this method does nothing and
 * returns. We can call the run() method multiple times. IT can be called in two
 * ways :
 * 1 . By calling the start() method
 * 2 . By calling the run() method itself
 */

/*
 * Difference between start() & run() method:
 * IF we call start() and seperate thread will be created which is responsible
 * to execute the run() method.
 * If we call run() , no seperate thread will be created , rather the method
 * will be called just like a normal method by main thread.
 */

// NEED OF THREADS
/*
 * Every Java program need atleast one thread to run.
 * Without Thread , we can't run any java program.
 * /
 * 
 * // MAIN THREAD
 * 
 * Although we haven't created any threads explicitly till now in our code ,
 * but Behind the scenes JVM implicitly creates a thread named "main" ,
 * because of which we are able to run our programs.
 * main thread have a priority of 5 by default.
 * We can change the name as well as the priority of main thread.
 */

// PRIORITY OF THREAD
/*
 * By default every thread we create have a priority of 5.
 * Priority rankings:
 * 1 = lowest , 5 = default & medium , 10 = highest priority
 * 
 */
public class Basic {

    public static void main(String[] args) {
        System.out.println("Before Changing: ");
        System.out.println("Name of main thread is : " + Thread.currentThread().getName());
        System.out.println("The priority of main thread is: " + Thread.currentThread().getPriority());
        System.out.println("-------------------------------------------------------------");
        System.out.println("Changing Name & Priority...");
        System.out.println("-------------------------------------------------------------");
        Thread t = Thread.currentThread();
        t.setName("shorya");
        t.setPriority(10);
        System.out.println("After Changing: ");
        System.out.println("Name of main thread is : " + Thread.currentThread().getName());
        System.out.println("The priority of main thread is: " + Thread.currentThread().getPriority());

    }
}