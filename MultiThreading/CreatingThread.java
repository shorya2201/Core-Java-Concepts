package MultiThreading;

// There is a inbuilt Thread class in java , which implements runnable interface by default.
// THe runnable interface contains run() method and the Thread class gives the implementation to 
//that run() method.Besides giving implementation to run() method , the Thread class also contains
// many important methods like start() , sleep() , join() , etc.

/*
 * There are 2 ways to create Thread in java:
 * 1. By extending Threads class : Have to create a class which extends Thread class and we have
 *  to define run() method in it, then we need to make object of that class by which we can access thread methods.
 * 
 * 2. By implementing Runnable method : In this we create a class and that class implements RUnnable
 * interface, since it does not extends thread class it means there is no relationship between thread class and this class...
 *  thats why creating object of class is not enough ,we have to create the THread explicitly 
 * in the main method before calling the start() method.
 */

/*
 * Question : What is THread Scheduler?
 * Answer : THe thread Scheduler also like Asst. of JVM which is responsible for all
 * of the thread functioning.It also ensures that if there is delay in any process in thread 1 then,
 *
 *  it will start executing thread 2. So that CPU time should not waste.
 */

// when we call start() method means we handing over the further responsibility of thread to THread Scheduler.

// Question : Why we always call start() method instead of calling the run() method directly?
/*
 * Answer : The start() method invokes Thread Scheduler which is known as BOSS of threads in
 * java.THe thread Scheduler also like Asst. of JVM which is responsible for all
 * of the thread functioning.That's why we should always call start() method so
 * that it can invoke Thread Scheduler.
 */

class MyThread extends Thread {
    public void run() { // Creating class which extends Thread class
        System.out.println("Executing Run method....");
    }
}

class MyThread2 implements Runnable {
    public void run() {
        System.out.println("This is a thread created by implementing Runnable interface");
    }
}

public class CreatingThread {
    public static void main(String[] args) {
        MyThread t = new MyThread();// creating object of our class to access thread methods.
        t.start();/*
                   * IT is the starting point of thread execution, it will call run() method
                   * automatically. If we directly call run() method without start() method , then
                   * the program will work as a Single threaded program. THis is because the
                   * start() method invokes Thread Scheduler which is known as BOSS of threads in
                   * java.THe thread Scheduler also like Asst. of JVM which is responsible for all
                   * of the thread functioning.That's why we should always call start() method so
                   * that it can invoke Thread Scheduler.
                   */

        MyThread2 m2 = new MyThread2(); // creating object of class
        Thread t2 = new Thread(m2);// As we have implemented Runnable interface thats why we have to create a
                                   // thread explicitly because there is no realtionship between our class and
                                   // Thread class
        t2.start();// Handing over the thread to thread scheduler as usual
    }
}