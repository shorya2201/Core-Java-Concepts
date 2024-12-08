package MultiThreading;

class Library implements Runnable {
    String res1 = "JAVA";
    String res2 = "SQL";
    String res3 = "DSA";

    // Deadlock : It is a condition in which two thread wants to access same
    // resource at same time , due to this both the threads are unable to complete
    // their execution due to unavailability of resources. This condition where
    // threads cant be executed due to resources unavailable acquired by other
    // thread , is known as DEADLOCK condition.

    // In DEADLOCK condition , threads are in the BLOCKED state and are stuck there
    // permanently.

    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("Student1")) {
            try {
                Thread.sleep(3000);
                synchronized (res1) {// here the student 1 acq res 1 & has put a lock on it.
                    System.out.println("Student 1 has acquired " + res1);
                    Thread.sleep(3000);
                    synchronized (res2) {// here the student 1 acq res 2 & has put a lock on it.
                        System.out.println("Student 1 has acquired " + res2);
                        Thread.sleep(3000);
                        synchronized (res3) {// the program get stuck here coz res 3 has been acq by student2 thats why
                                             // it is not available to be accessed by any other student or thread, This
                                             // is DEADLOCK condition.
                            System.out.println("Student 1 has acquired " + res3);
                            Thread.sleep(3000);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Some problem!!!");
            }
        } else {
            try {
                Thread.sleep(3000);
                synchronized (res3) { // here student 2 has acq res 2 & has put a lock on it
                    System.out.println("Student 2 has acquired " + res3);
                    Thread.sleep(3000);
                    synchronized (res2) {// not reached , program stuck
                        System.out.println("Student 2 has acquired " + res2);
                        Thread.sleep(3000);
                        synchronized (res1) {// not reached , program stuck
                            System.out.println("Student 2 has acquired " + res1);
                            Thread.sleep(3000);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Some problem!!!!");
            }
        }
    }
}

public class DeadLock {
    public static void main(String[] args) {
        Library lib = new Library();
        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib);
        t1.setName("Student1");
        t2.setName("Student2");
        t1.start();
        t2.start();
    }
}
