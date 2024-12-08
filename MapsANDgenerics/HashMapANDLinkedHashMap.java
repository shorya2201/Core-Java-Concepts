package MapsANDgenerics;

import java.util.*;
import java.util.HashMap;

public class HashMapANDLinkedHashMap {
    // Some methods = put , putAll , putIfAbsent
    /*
     * Insertion order is not preserved in the HashMap.coz it is stored using
     * HashFunction.
     * KEY & VALUE both are stored as an object.
     * HashMap is almost similar to HashTable except that it is non-synchronized and
     * allows NULL KEYS & VALUES.
     */
    public static void main(String[] args) {
        HashMap hm1 = new HashMap();
        hm1.put(1, "Shorya");
        hm1.put(2, "Diya");
        hm1.put(null, "Sam");// Both the KEY & VAlUE can be NUll
        hm1.put(4, null);// Both the KEY & VAlUE can be NUll
        hm1.put(3, "Jacky");
        hm1.put(3, "Sandeep");// If given duplicate KEY then , the previous VALUE will be overwritten .
        System.out.println(hm1);

        HashMap hm2 = new HashMap();// The KEY need not necessarily to be a number , as it is stored as object
                                    // therefore it can be of any data type.
        hm2.put("Shorya", "Rastogi");
        hm2.put("Diya", "Rastogi");
        hm2.put("Sandeep", "Rastogi");
        System.out.println(hm2);

        // As we are seeing Order of Insertion is not preserved in the HashMap , for
        // this the LinkedHashMap comes into picture.Released in Java v1.4

        LinkedHashMap lhm1 = new LinkedHashMap();// 100% assured that Order of Insertion is maintained.
        lhm1.put("Shorya", "Rastogi");
        lhm1.put("Diya", "Rastogi");
        lhm1.put("Sandeep", "Rastogi");
        System.out.println(lhm1);
    }
}