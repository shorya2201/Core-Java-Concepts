// When we want to do initialization at the time of object creation then the
// concept of Constructor comes into picture.
// Main objective of Constructor is nothing but initialization of object.
// We can also understand Constructor as a specialized setter , which name is
// same as the class name. 
// Whenever we are creating an object some piece of code get executed
// automatically to perform initialization of object . This piece of code is
// nothing but a Constructor.
// Object creation is not enough , compulsorily we should perform initialization
// then only the object is in a position to provide the response properly.
//Constructor is called at the time of object creation.
//Main purpose is to initialize instance variable.
//If you want that some code should be initialized at the time of object creation itself then we write that code under a Constructor of that class.
//9516502352
package Constructors;

class Student {
    private String name;
    private int age;

    // Constructor(Specialized Setter which can does initialization at the time of
    // object creation)
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setter
    // public void setName(String name){
    // this.name = name ;
    // }
    // public void setAge(int age){
    // this.age = age ;
    // }

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Basic {
    public static void main(String[] args) {
        Student st = new Student("Shorya", 20);// In this the Student (name , age) part is called the Calling of
                                               // constructor
        System.out.println(st.getName());
        System.out.println(st.getAge());
    }

}