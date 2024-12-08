
public class basic {

    public static void main(String[] args) {

        // String is a collection of objects
        // String is a class in java
        // Standard declaration :- String name = "Shorya";
        // Objects of string are created in Heap Memory area
        // String class is situated in java.lang package

        // // Types of String:-
        // 1.Mutable string(Changeable) Uses declaration String name = "Shorya"
        // when try to change new object is created but pointer still points the old one
        // 2.Immutable string(Non Changeable) Uses StringBuffer or StringBuilder class
        // when try to change the change happen in existing object and pointer refers
        // the same one
        // By Default Strings are immutable untill declared with String Builder or
        // StringBuffer

        String name = "SHorya";
        System.out.println(name);
        name.concat("Rastogi");
        System.out.println(name);// not changed still print Shorya

        StringBuilder name1 = new StringBuilder("Diya");
        System.out.println(name1);
        name1.append("Rastogi");
        System.out.println(name1);// changed now prints DiyaRastogi

    }
}