package Polymorphism;

//Abstraction is a process of hiding the implementation 

//Abstraction can be achieved using 
// 1.Abstract Class    2.Abstract Method in Java

//If we have written a method without its defination then must and should we must declare that method as abstract.
//A method which only have method signature but does not have any body is known as abstract method.

//If any class in java contains abstract method then must and should the class must be declared as abstract class. 

//We can create reference of abstract class and using that reference we can implementing methods of child class.

//We cannot create object of abstract class i.e. we cannot intantiate abstract class because it does not have any implementations in it therefore it contains incomplete methods
//An abstract class can contain abstract as well as non abstract methods. in that case 100% abstraction will not be achieved .

//Using Parent class (Abstract class) object we can call override & inherited methods of child class but we cant call specialized method by creating a parent class reference for child class object.

abstract class Aeroplane2 {// As all methods of this class only have method signature but none of them have
                           // declaration . Hence we are achieving 100%
                           // abstraction in this.
    abstract public void fly2();

    abstract public void takeoff2();

    public void landing() {
        System.out.println("Aeroplane is landing.");
    }

}

class Cargoplane2 extends Aeroplane2 {

    public void fly2() {
        System.out.println("CargoPlane flies at lower height.");
    }

    
    public void takeoff2() {
        System.out.println("CargoPlane require longer runway.");
    }

    public void alert() {
        System.out.println("CargoPlane is flying.");
    }

}

public class Abstraction {
    public static void main(String[] args) {

        Aeroplane2 ref3 = new Cargoplane2();
        ref3.fly2();
        ref3.landing();// Using Parent class (Abstract class) object we can call override & inherited
                       // methods of child class but we cant call specialized method by creating a
                       // parent class reference for child class object.
                       // ref3.alert();
        ((Cargoplane2) ref3).alert();// we can cast it to make it happen

    }

}
