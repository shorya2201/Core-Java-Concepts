package Collections;

import java.util.*;

public class IteratorANDListIterator {

    /*
     * To access the data stored in the collection :
     * 1. For loop
     * 2. for-each loop
     * 
     * The loops are not recommended for accessing collection values because if
     * CONCURRENT MODIFICATION is happening the loop will become an infinite
     * loop.(FAIL FAST & FAIL SAFE)
     * 
     * 3. ITERATOR method (CURSOR CONCEPT)
     */

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);

        // 1. For loop
        System.out.println("By FOR LOOP:");
        for (int i = 0; i < al.size(); i++) {
            Object o = al.get(i);// coz in arraylist data is stored in the form of objects.
            System.out.println(o);
            /*
             * But as we know in many collections like priority queue, array Deque , tree
             * set ,etc. Index-based accessing is not allowed , in that case we use for-each
             * loop.
             */
        }

        // 2. For-each loop
        System.out.println("By FOR-EACH LOOP:");
        for (Object obj : al) {
            System.out.println(obj);
        }

        // 3. Iterator Concept
        Iterator itr = al.iterator();// returns a cursor which points to the -1 index of arraylist(coz if arraylist
                                     // is empty it will return false)

        // Available to use in all COllection classes.
        // Iterator has following primary methods:
        /*
         * 1. itr.hasNext() = return boolean value wheather a value is present in the
         * next index or not
         * 2. itr.next() = return the object at the current index and move the cursor to
         * index+1 location.
         */
        System.out.println("By ITERATOR: ");
        while (itr.hasNext()) {// wheather data is available on next index or not
            Integer i = (Integer) itr.next();// returns data on current index and moves the cursor to next index.
            System.out.println(i);
        }

        // 4.ListIterator

        // IT is only available in List Classes like ArrayList & linkedLIst.
        // If want to traverse other classes then have to add the whole collection into
        // some arraylist or linkedlist and then apply listiterator on it.

        // Advantage of listIterator is that it can traverse from both the
        // directions.i.e. FRONT & REVERSE

        System.out.println("By LIST ITERATOR: Front Order ");
        ListIterator lifro = al.listIterator();
        while (lifro.hasNext()) {
            System.out.println(lifro.next());
        }

        System.out.println("By LIST ITERATOR: Reverse Order ");
        ListIterator lirev = al.listIterator(al.size());// initializing it with last index , so that we can traverse
                                                        // from back .
        while (lirev.hasPrevious()) {
            System.out.println(lirev.previous());
        }

    }

}
