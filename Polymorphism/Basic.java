package Polymorphism;

class Aeroplane1 {
    void takeoff() {
        System.out.println("Aeroplane require normal runway");
    }
}

class Cargoplane1 extends Aeroplane1 {
    void takeoff() {
        System.out.println("Cargoplane require longer runway");
    }
}

class Fighterplane1 extends Aeroplane1 {
    void takeoff() {
        System.out.println("Fighterplane require small runway");
    }
}

class Airport {
    void all(Aeroplane1 ref) {// taking parent class object as argument to acheive polymorphism
        ref.takeoff();
    }
}

public class Basic {

    // If one thing exist in more than one form then it is known as
    // polymorphism.There are two types of polymorphism : Static & Dynamic.

    // Polymorphism in java can be achieved in two ways : Method Overloading &
    // Method Overriding

    // 1.Method Overloading(Static) :- The process of extending the existing method
    // functionality with new functionality is known as Method Overloading . For
    // this , different method signatures must be provided to methods.

    // 2.Method Overriding(Dynamic) :- The process of replacing existing method
    // functionality with new functionality is known as Method Overrriding . For
    // this , same method prototypes must be provided to methods . For this ,
    // Inheritance is a must.

    public static void main(String[] args) {

        Aeroplane1 c1 = new Cargoplane1();
        Aeroplane1 f1 = new Fighterplane1();

        Airport a1 = new Airport();

        a1.all(c1);
        a1.all(f1);
    }
}
