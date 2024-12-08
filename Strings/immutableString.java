public class immutableString {
    public static void main(String[] args) {

        // METHODS OF CREATING A IMMUTABLE STRING

        /*
         * Ways of creating immutable string
         * 1)String s1 = "content"; [stored in SCP]
         * 2)String s1 = new String ("content"); [stored in Heap]
         * 3)String s2 = s1.inbuiltMethod(); [stored in Heap]
         * 4)String s3 = s1 + s2; [stored in Heap]
         */

        // MEMORY MAPPING OF STRING & ITS STORAGE

        /*
         * Strings generally stored in SCP (String Constant Pool) but if created using
         * any of the technique given below it will be stored in Heap Area outside the
         * SCP:
         * 1) If created using the 'new' keyword
         * 2) If created using any inbuilt method like concat , etc.
         * 3) If created using reference variables like , s3 = s1 + s2;
         */

        String name1 = "SHorya";
        System.out.println(name1);

        // In this way String is stored in Heap area outside the SCP
        String name2 = new String("Diya");
        System.out.println(name2);

        // Same as second way
        char[] ch = { 'J', 'a', 'c', 'k', 'y' };
        String name3 = new String(ch);
        System.out.println(name3);

        /*
         * Duplicate values are not allowed in the SCP(upper & lower cases also matters)
         * , if happens then both the
         * reference will point the same address/objects(JVM will maintain 1 copy of
         * string objects declared outside the SCP)
         */

        String s1 = "Sandeep";
        String s2 = "Sandeep";

        String s3 = new String("Sandeep");
        String s4 = new String("Sandeep");

        System.out.println(s1 == s2);// gives true , same address coz of SCP storing
        System.out.println(s3 == s4);// gives false , different address coz of stored outside SCP in Heap area
    }
}
