package ExceptionHandling;

import java.util.Scanner;

/*
 * Throw keyword is used to create a custom exception.
 * Throw keyword is used to throw an exception explicitly.
 * Throw keyword is used when we want to throw an custom exception by our choice based on certain conditions.
 * Using THROW keyword we can also print custom error message. This can be done by writing a custom message while calling an exception,
 */

/*
 * Let's understand THROW keyword by a simple scenario
 * 
 * Scenario is like we have two numbers , we have to divide them , 
 * 1. If both the numbers are positive print the result.
 * 2. If num2 is 0 throw an exception.
 * 3. If num2 is a negative number , then throw an exception explicitly.
 */

class MyException extends Exception {// Here we have created a Custom Exception using THROW keyword

    // It contains two constructors , one is non parameterized and other one is non
    // parameterized.

    // This is the Non Parameterized Constructor
    public MyException() {
    }

    // This is the Parameterized Constructor
    public MyException(String msg) {
        super(msg);// Written this so that we can pass any custom message while calling our custom
                   // exception
    }
}

public class Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        try {
            if (num2 < 0) {// Here if the number is less than 0, then we directly want to execute the CATCH
                           // block. That's why we are calling an exception explicitly.And for that we are
                           // using THROW keyword.
                Exception e = new ArithmeticException("THis is a NEgative Number!!");// Can also print a custom error
                                                                                     // message using THROW keyword
                throw e;
            } else {
                int result = num1 / num2;
                System.out.println(result);
            }

        } catch (Exception e) {// This will execute in 2 cases : If the number is 0 , If the number is less
                               // than 0 due to explicitly exception using THROW keyword.
            System.out.println("Enter a valid number!!!  " + e);
        }
    }
}
