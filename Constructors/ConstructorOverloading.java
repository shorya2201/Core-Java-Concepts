package Constructors;

//Constructor Overloading :- Writing multiple COnstructors with same name but 
//different Parameters.

class Demo1 {
    private String name;
    private int age;

    Demo1() {// Constructor without any parameter
        System.out.println("Default Constructor is called!");
        name = "Rohan";
        age = 19;
    }

    Demo1(String name) {// COnstructor with single parameter
        this.name = name;
        age = 20;
    }

    Demo1(String name, int age) {// COnstructor with multiple parameters
        this.name = name;
        this.age = age;
    }

    void disp() {
        System.out.println(name);
        System.out.println(age);
    }

}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();// Calling Zero parameterized Constructor
        Demo1 d2 = new Demo1("Rohit");// Calling Single Parameterized Constructor
        Demo1 d3 = new Demo1("Ronak", 21);// Calling multiple parameterized Constructor

        // Each method call will give different values as they are initialized using
        // different COnstructors.
        d1.disp();
        d2.disp();
        d3.disp();

    }
}
