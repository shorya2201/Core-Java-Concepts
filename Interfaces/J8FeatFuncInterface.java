package Interfaces;

// JAVA 8 Features
/*
 * Sometimes situations arises where we want to change something in our
 * interface
 * But doing this will cause us to also implement those changes in all the
 * classes which implement those interfaces
 * Therefore this problem is solved from JAVA 8 , now we can also define methods
 * in interfaces.
 */

/*
 * For defining methods inside the interface two keywords are introduced:
 * 1. static
 * 2. default
 */

/*
 * static: We can add static keyword before the return type while writing a
 * method so that we can define them.
 * We can call those methods directly by INTERFACE_NAME.method_name
 */

/*
 * default: It is also known as non static method. We can add default keyword
 * before
 * return type while writing method so that we can define them.
 * To call those methods we have to implement that interface on a class
 * and after that we can call it by creating object of that class.
 */

// FUNCTIONAL INTERFACE
/*
 * Types of interface:
 * 1. Functional Interface(Single Abstract Method Interface): Contains only one
 * interface and further used in Lambda expressions
 * 2. Normal Interface : Contains more than one methods
 * 3. Marker Interface : Contains no methods , only used for signalling. Majorly
 * used in serialization.
 */

// If any java interface allows only one abstract method then it is called a
// FUNCTIONAL METHOD
// To make any interface as FUNCTIONAL INTERFACE we just have to write the
// following
// annotation just above the interface [@FunctionalInterface]
// Example: java.lang.Runnable , java.lang.Comparable , etc.
interface A {
    default void show() {// Have to create a class which implement it then create object of that class to
                         // call this method
        System.out.println("in show by default keyword");
    }

    static void config() {// Can directly call this method directly just by INTERFACE_NAME.method_name
        System.out.println("in config by static keyword");
    }
}

class B implements A {
    // To call non static method we are creating a class which implement it.
}

public class J8FeatFuncInterface {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();// Calling non static method
        A.config();// Calling static method
    }
}
