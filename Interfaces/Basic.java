package Interfaces;

//Interface is almost same as abstract class

/*
 * It will only allow abstract methods
 * It cannot be instantiated
 * Variable are "public static final"
 * Methods are "public & abstract"
 * No constructor in interface
 */
//Classes can implement multiple interfaces at same time....in this way we acheive multiple inheritance in java

//Abstract vs Interface

/*
 * Screenshot in this folder
 */
interface A {
    int a = 10;// we can only define variables becoz they are marked final by default in
               // interfaces
    int b = 5;

    void add();// we can only declare methods we cant define them becoz they are marked
               // abstract by defauly in interfaces
}

interface C {
    void sub();
}

class B implements A, C {
    int c;

    public void add() {
        c = a + b;
        System.out.println("Addition is: " + c);
    }

    public void sub() {
        c = a - b;
        System.out.println("Subtraction is: " + c);
    }
}

public class Basic {
    public static void main(String[] args) {
        System.out.println(A.a);// we can directly call it coz they are static
        // A.a = 5; Cant change their value coz they are final.
        // A obj = new A; Cannot be instantiated.
        B obj = new B();
        obj.add();
        obj.sub();
    }
}
