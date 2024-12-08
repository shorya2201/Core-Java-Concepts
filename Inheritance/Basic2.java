package Inheritance;

class Newbie {
    int age;

    Newbie() {// Constructor
        System.out.println("This statement executed by constructor. ");
    }

    void life() {
        age = 19;
        System.out.println("Shorya is 19 years old. ");
    }
}

class Pro extends Newbie {
    void disp() {
        // System.out.println(age);
        System.out.println("This is executed by child class");

    }
}

public class Basic2 {
    public static void main(String[] args) {
        Pro srs = new Pro();// The Constructor executes at the time of object creation
        srs.life();
        srs.disp();

    }
}
