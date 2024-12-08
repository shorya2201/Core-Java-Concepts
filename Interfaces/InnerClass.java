package Interfaces;

/*
 * Inner class is a class inside a class.
 * We can create a class inside an existing class just to organize things more neatly.
 * The concept of inner class is not popularly used in development field.
 * We are studying this concept just for knowledge.
 * 
 * Inner class is of 3 types:
 * 1. Member inner class : doesn't need any keyword to denote this. Calling is like  MAIN_CLASS.INNER_CLASS object_name = MAIN_CLASS_OBJ.new B();
 * 2. Static inner class : need to add static keyword while declaring class. Calling is like MAIN_CLASS.INNER_CLASS object_name = new MAIN_CLASS.INNER_CLASS();
 * 3. Anonymous inner class : Used to define methods of an interface. Calling is like INTERFACE object = new INTERFACE(){**body of method**}
 */

//Member Inner Class Demo
class Father {
    class Son {
        public static void add() {
            System.out.println("Sum of two numbers.");
        }
    }
}

// Static Inner Class Demo
class Mother {
    static class Daughter {
        public static void diff() {
            System.out.println("Difference of two numbers.");
        }
    }
}

interface Car {
    void speed();
}

public class InnerClass {
    public static void main(String[] args) {
        Father a = new Father();
        Mother c = new Mother();

        // Member Inner class object creation
        Father.Son obj1 = a.new Son();/* MAINCLASS.INNERCLASS object = MAINCLASS_OBJ.new INNERCLASS() */

        // Static Inner class object creation
        Mother.Daughter obj2 = new Mother.Daughter();/* MAINCLASS.INNERCLASS object = new MAINCLASS.INNERCLASS() */

        obj1.add();
        obj2.diff();

        /* ANONYMOUS INNER CLASS DEMO */
        Car obj = new Car() { // Creating object of Anonymous Inner Class
            public void speed() {
                System.out.println("Car is Running with speed of 200KMpH");
            }
        };
    }
}
