package Api;

import java.util.*;
import java.util.stream.Stream;

public class StreamAPI {

    /*
     * 
     * It was introduced in Java 8.
     * It is used to work with data and perform operation on data or changing its
     * values, without affecting the original data.
     * To do this we make a separate stream of that data using Stream API.
     * 
     * Whenever we want to do some operation on collection or want to change its
     * values without affecting the original values, we make a separate stream of
     * that collection data and perform operations on that stream only. So that
     * whatever operation we perform or changes in data we make, our original data
     * will be kept untouched as we are performing operations on a separate stream.
     * 
     * We invoke stream() method to make a separate stream of the collection we
     * passed as an argument.
     * We store that stream in Stream class object and also important specify
     * Generic.
     * 
     * Then we use forEach() method on stream object to iterate over the objects of
     * that stream.
     * 
     * Whenever we perform operation on a stream, it is called consuming the stream.
     * 
     * We can consume a stream only once.
     * 
     * If we try to consume stream more than once, it will throw runtime exception.
     * 
     */

    public static void main(String[] args) {

        List<Integer> al = Arrays.asList(2, 4, 6, 8, 10);
        Stream<Integer> streamData = al.stream();
        streamData.forEach(i -> { // Consuming the Stream
            i *= 2; // Consuming the Stream
            System.out.print(i + " "); // Consuming the Stream
        }); // Consuming the Stream

        System.out.println();

        al.forEach(i -> System.out.print(i + " "));

    }

}
