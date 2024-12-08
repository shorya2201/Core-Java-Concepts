package Constructors;

//super() :- Its work is to call the parent class constructor with respective parameter.
//this() :- Its work is to call the same class constructor with respective parameters.

//Wheather you write or not the JVM will automatically include super() method call.The JVM will not call this() 
//method call itself you have to write this() if you want to include.
//this() or super() only one method call can be written inside a constructor.
//Both this() and super() will only be written in the first line of Constructor itself.

class Student2 {// It is Parent class
    Student2() {
        System.out.println("Zero parameterized Parent Class COnstructor");
    }
}

class Demo2 extends Student2 {// It is child class
    private String name;
    private int age;

    Demo2() {// Due to super() method call , It will first call the zero parameterized
             // constructor present in parent class.i.e.Student2.
        super();
        System.out.println("Zero Parameterized Child class constructor");
        name = "Rohan";
        age = 19;
    }

    Demo2(String name) {// Due to this() method call , It will first call the zero parameterized
                        // constructor present in same class. i.e. just above it.
        this();
        this.name = name;
        age = 20;
    }

    void disp() {
        System.out.println(name);
        System.out.println(age);
    }

}

public class ThisVSsuperMethodCall {

    public static void main(String[] args) {

        Demo2 d2 = new Demo2("Shorya");// It will call the Single Parameterized CHild class constructor.
        d2.disp();

    }
}
