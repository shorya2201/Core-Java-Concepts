package Encapsulation;

class EncapBasic {
    int speed = 99;
    private int age;

}

public class BasicDemo {

    public static void main(String[] args) {
        /*
         * In order to provide controlled access to data we use ENCAPSULATION.
         * 
         * # Binding of data and corresponding methods into a single unit is called
         * Encapsulation.
         * # Encapsulation = Data Hiding + Data Abstraction
         * # If any class follows data hiding and data abstraction then that class is
         * referred as Encapsulated class.
         * 
         * # If data is not visible to outside world normally , then it is known as data
         * hiding.
         * # If outside world also dont know the implementation of code or method , then
         * it is known as data abstraction.
         * 
         * 
         */

        EncapBasic eb = new EncapBasic();

        System.out.println(eb.speed);
        // System.out.println(eb.age); == This statement cant be executed coz of it is
        // private and hidden from outer world and cannot be accessed normally.
    }
}
