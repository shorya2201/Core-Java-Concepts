package Api;

import java.util.*;

public class ForEachMethod {

    // This is Enhanced for-loop
    /*
     * for(Integer i : list){
     * //
     * *** method body ****
     * //
     * }
     */

    /*
     * 
     * For Each method was introduced in Java 8.
     * 
     * Generally used in Stream API.
     * 
     * Before Java 8 we are iterating the collections using an external loop.
     * This results in higher time complexity.
     * 
     * For Each method in an inbuilt method of collections which iterate collection
     * without any loop.
     * 
     * It was defined in Consumer interface. Because forEach method assumes you to
     * give implementation to Consumer interface in which the forEach method is
     * defined.
     * 
     * Consumer interface is a functional interface.
     * Means we can use lambda method to implement body of forEach method.
     * 
     * 
     * 
     */

    // In below example 'i' indicates or have same meaning as " Integer i" in
    // enhanced for loop.
    // We do not have to define what type of variable it is because it is an
    // collection object and collection can handle all type of variables be it
    // Integer, Character or String.
    // That's why we can directly name our variable,which in this case is 'i' and
    // can perform our further operations.
    // No problem will be arised becaused we have used generics while creating
    // ArrayList.

    public static void main(String[] args) {

        // Alternate method to create a Arraylist when some values to be stored are
        // known.
        // Can use any Generic Integer, Character or anything.
        List<Character> list = Arrays.asList('a', 'b', 's', 'h', 'o', 'r', 'y', 'a');

        // For-Each loop body
        list.forEach(i -> System.out.print(i + " "));

    }

}
