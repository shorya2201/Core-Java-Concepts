package Api;

import java.util.*;
import java.sql.*;

public class DateTimeAPI {
    /*
     * 
     * It is also called JODA Time API (Introduced from Java8)
     * 
     * Before this JODA API,
     * It is impossible to store dates and time values in Java by using STRING and
     * other data types.
     * 
     * Therefore to overcome this Java have Data and Time Classes.
     * 
     * These classes are present inside two packages:
     * 1. java.util - Can instantly give the data and time without any arguments
     * being passed.
     * 2. java.sql - To get data from this we have to pass time as an argument ,
     * means this class is dependent on the above class.
     * 
     */

    public static void main(String[] args) {
        // We can also use external classed without importing them, below is the
        // IMPLEMENTATION:

        java.util.Date d = new java.util.Date();
        System.out.println(d);// Prints Date, Time and TimeZone.

        long time = d.getTime();

        java.sql.Date dt = new java.sql.Date(time);

        System.out.println(dt.toString());// Prints only Date
    }

}
