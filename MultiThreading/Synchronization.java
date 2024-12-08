package MultiThreading;

class Car implements Runnable {
    // When we have one resource and multiple threads are executing it we get
    // illogical output as we can see in this case if we dont use synchronized
    // keyword which is a big problem & (RACE CONDITION) arises.

    // TO solve this we have a concept of SYNCHRONIZATION.

    // we can apply synchronized keyword to method and block
    // both ,
    // When applied to method: by doing this the resource can only be accessed by
    // one thread at a time till it finished its execution . Then only the other
    // thread can access it.
    // When applied to block : by doing this a particular block can be accessed by
    // one thread only till it finished its execution.

    // METHOD SYNCHRONIZATION EXAMPLE

    // synchronized public void run() {
    // String name = Thread.currentThread().getName();
    // try {
    // System.out.println(name + " has entered parking lot.");
    // Thread.sleep(2000);
    // System.out.println(name + " got into car to drive.");
    // Thread.sleep(2000);
    // System.out.println(name + " is driving the car.");
    // Thread.sleep(2000);
    // System.out.println(name + " has returned and parked car in parking lot.");
    // } catch (Exception e) {
    // System.out.println("Some problem!!!");
    // }
    // }

    public void run() {
        String name = Thread.currentThread().getName();
        try {
            System.out.println(name + " has entered parking lot.");
            Thread.sleep(2000);
            synchronized (this) {// by doing this to block, this code can only not be accessed by a other thread
                                 // untill it finished its execution
                System.out.println(name + " got into car to drive.");
                Thread.sleep(2000);
                System.out.println(name + " is driving the car.");
                Thread.sleep(2000);
                System.out.println(name + " has returned and parked car in parking lot.");
            }
        } catch (Exception e) {
            System.out.println("Some problem!!!");
        }
    }
}

public class Synchronization {
    public static void main(String[] args) {
        Car c = new Car();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);
        t1.setName("SON 1");
        t2.setName("SON 2");
        t3.setName("SON 3");
        t1.start();
        t2.start();
        t3.start();
    }
}
