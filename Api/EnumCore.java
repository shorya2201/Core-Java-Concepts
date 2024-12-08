package Api;

/*
 * -> It was introduced in Java5 (JDK 1.5).
 * -> Whenever we have a set of values which are going to be remain constant
 * throughout the program, then we store those constant values under enum.
 * -> Whenever we have predefined set of values or set of constants, we use enum
 * to store them.
 * -> Before enum we were using final keyword to define constants in the
 * program.But, the program become very unorganized when we have many constants
 * to define. To solve this & organize constants in a defined manner enum is
 * used.
 * 
 * We can define values under enum as both uppercase and lowercase. But, it is
 * Best practice or convention to use UPPERCASE while defining constant values.
 * 
 * Values in enum does not belong to any data type.
 * They have their own data type ( in this case its Week), which is called
 * Enumerated data type.
 *
 * We cant create object of enum.
 * 
 * To call enum values treat enum name as class.
 * Like:
 * Week w = Week.MON;
 * 
 * We can also define enum inside class.
 * 
 * Compared to other languages java's enum is more powerful.
 * 
 * 
 * There is a Enum class in java.lang package.
 * Every enum is extending that Enum class internally.
 * Enum class provides many methods which are helpful in interacting with enums. Like ordinal(),
 * values(), hashcode(), etc.
 * 
 */

// Defining enum
enum Week {
    MON, TUE, WED, THU, FRI, SAT, SUN; // the values themselves are variables, constants .
}

public class EnumCore {

    enum Season {
        SUMMER, WINTER, RAINY;
    }

    public static void main(String[] args) {
        Week w = Week.SUN;
        System.out.println(w); // Prints SUN

        Season s = Season.WINTER;
        System.out.println(s);

        // Experimenting with methods
        Season seasons[] = Season.values();
        for (Season se : seasons) {
            System.out.println(se + " " + se.ordinal());
        }
    }
}
