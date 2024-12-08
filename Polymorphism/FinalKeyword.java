package Polymorphism;

//FINAL CLASS

//If we want that no other class can inherit our class then we declare that class as final.
//If we want to restrict a class from taking part in inheritance then we declare that class as final.

//FINAL METHOD

//When we declare any method as final , then still it can be inherited but it cant be modified or overridden.

//FINAL VARIABLE

//We can also declare variable as final , then the variable will start behaving as a constant.Its value cant be changed any further.

// final class Animal1{
// public void sleep(){
//     System.out.println("Animal is sleeping.");
// }
// }

class Animal1 {
    final int age = 22;// WILL BEHAVE AS A CONSTANT

    final public void sleep() {
        // age = 23;//BEHAVING AS CONSTANT
        System.out.println("Animal is sleeping.");
    }
}

class Tiger1 extends Animal1 {
    // public void sleep(){} CANNOT BE OVERRIDDEN
}

public class FinalKeyword {

}
