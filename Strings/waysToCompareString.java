public class waysToCompareString {
    public static void main(String[] args) {
        /*
         * 2 ways to compare strings
         * a) == operator :- Compares the reference(or address) of the Strings.
         * b) equals() method :- Compares the content of the object
         * 
         * 
         * 
         */

        String s1 = "Shorya";
        String s2 = new String("Shorya");
        String s3 = "SHORYA";

        System.out.println(s1 == s2);// false, coz reference(address) are different (heap and SCP)
        System.out.println(s1.equals(s2));// true,coz contents are same
        System.out.println(s1.equalsIgnoreCase(s3));// true , this method ignore case considerations

    }
}
