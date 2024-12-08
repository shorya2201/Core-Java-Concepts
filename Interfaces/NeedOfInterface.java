package Interfaces;

//Interface is mandatory to acheive Multiple inheritance

//In java , multiple inheritance can only be acheived by interface
//Without interface , we cant inherit functions and variables 

//without interface we have to change reference object everywhere in 
//the entire code but with interface we only have to change object reference 
//only in main method
interface Computer {// Will be used as a design of our code
    void compileCode();
}

class Laptop implements Computer {
    public void compileCode() {
        System.out.println("Compiled with no error");
    }
}

class Desktop implements Computer {
    public void compileCode() {
        System.out.println("Compiled with no error, Faster");
    }
}

class Developer {
    public void buildApp(Computer obj) {// passed object of parent class as reference so that we can call methods from
                                        // both classes as per need.
        System.out.println("Building App");
        obj.compileCode();
    }
}

public class NeedOfInterface {
    public static void main(String[] args) {
        Computer obj1 = new Desktop();
        Computer o2 = new Desktop();
        // we created objects of al the child classes with parents class reference so
        // that we can also access interface design
        Computer obj2 = new Laptop();
        Developer dev = new Developer();
        dev.buildApp(o2);// we can pass any object as argument to access methods and behaviours of that
                         // class.
    }
}
