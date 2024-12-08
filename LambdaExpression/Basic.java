package LambdaExpression;

/*
 * It was introduced in JAVA 8. 
 * It works only for Functional Interfaces.(which contains only one method)
 * It works with Anonymous Class.
 * Used to provide implementation to Functional Interfaces. Means Less Coding. 
 */

/*
 * 1. No Parameters : () -> {**body of method**}
 * If body contains only one statement then the curly braces are optional.
 * 
 * 2. Multiple Parameters : (arg1 , arg2 ...) -> {**body of method**}
 *  
 * */

interface Vehicle {
    void car();
}

public class Basic {
    Vehicle obj = () -> {
        System.out.println("Car is Running!!!");
    };
}
