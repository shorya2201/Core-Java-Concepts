package MultiThreading;

public class ExtendvsImplement {

    // IT IS HIGHLY RECOMMENDED / GOOD PRACTICE THAT YOU SHOULD CREATE THREAD BY
    // IMPLEMENTING
    // RUNNABLE INTERFACE.

    // Extending THread Class
    /*
     * # As we are creating by extending Thread class , thats why we cant extend any
     * other class if needed because multiple inheritance is not possible in java,
     * resulting in restricted coding .
     * 
     * This is not the best approach to create threads.
     */

    // Implementing Runnable Interface
    /*
     * # We have scope of extending any other class if needed as we can acheive
     * multiple inheritance by means of interface....resulting in unrestricted
     * coding and maximum efficiency.
     * 
     * This will be the best approach to create thread as we can extend multiple
     * classes if needed their functions.
     * 
     * # this helps us to acheive loose coupling by code to interface.
     */

    public static void main(String[] args) {

    }
}
