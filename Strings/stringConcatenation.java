public class stringConcatenation {
    public static void main(String[] args) {
        /*
         * Strings created using reference variable or any inbuilt method will also be
         * stored in Heap Area despite defining without a 'new' keyword
         * 
         * String Concatenation meant connecting two or more strings together to form a
         * new string.
         * This can be done by two ways :
         * 1) + operator : We can join multiple ref. strings or new string text all at
         * one time or single execution.
         * We can also join numbers and text all at single execution using + operator
         * 
         * 2) String.concat() method : We can concat only one concatenation of ref.
         * string or single string text at one time or single execution
         */

        // EXAMPLE OF CONCAT METHOD IMPLEMENTATION
        String s1 = "Shorya";// it is stored in SCP
        String s2 = s1.concat("Rastogi");// stored in Heap outside the SCP coz of using inbuilt method for defining
        String s3 = "Shorya";// stored in SCP
        s3 = s3.concat("Rastogi");// stored in SCP

        // EXAMPLE OF CONCATENATION BY + OPERATOR
        String str1 = "Diya";
        String str2 = "Rastogi";
        String str3 = str1 + str2 + " is 19 Years old";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
