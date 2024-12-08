package Inheritance;

// Inheritance is a property of OOPS concept where we inherit
// properties(variables) & behaviours(functions) of parent class to a 
// child class

/* INHERITANCE can be acheived by using extends keyword.
 * The "extends" keyword creates a IS-A relationship between two classes
 * Eg: It Means Shorya IS-A Rastogi.
 * INHERITANCE increases reusability of our code as we write a piece 
 * of code in one class and use it in N no. of classes as we want.
*/

class Rastogi { // parent class , super class , base class
    int age = 19;
}

class Shorya extends Rastogi {// child class , derived class, sub class

}

public class Basic {
    public static void main(String[] args) {

        Shorya r = new Shorya();
        System.out.println(r.age);
    }
}