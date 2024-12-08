package Api;

import java.util.*;
import java.util.stream.Stream;
/*
* count() --> Count elements in stream using count().
* 
* map() --> When we want to perform same operation on all the stream elements
* like adding 5 to all the elements to multiplying them by 2, etc. We use map()
* function.
         * Calling map() function requires us to give implementation to Function
         * Interface which is a functional interface.
         * 
         * filter() --> When we want to store only selected data or elements into our
         * stream. In simple words when we want to filter out data and store filtered
         * data into our stream we use filter() method.
         * Calling filter() method requires us to give implementation to Predicate
         * Inteface which is a Functional Interface.
         * 
         */

public class AdvStreamAPI {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1, 9, 5, 6, 2, 7, 3);
        Stream<Integer> streamData = al.stream(); // Creates a new Stream

        // As return type of almost all the functions is Stream. We can do function
        // chaining.Like:

        Stream<Integer> finalData = streamData.filter(n -> n % 2 == 0).sorted().map(n -> n * 2);

        // Stream<Integer> finalData = streamData.filter(n -> n % 2 == 0); // Returns
        // Stream consisting only even values
        // Stream<Integer> sortedStream = finalData.sorted(); // Sorts in Asc. order
        // Stream<Integer> mapStream = sortedStream.map(n -> n * 2); // Multiplies all
        // the stream values by 2.

        finalData.forEach(n -> System.out.print(n + " ")); // Printing the Stream elements.
    }
}
