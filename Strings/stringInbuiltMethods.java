public class stringInbuiltMethods {
    public static void main(String[] args) {
        /*
         * Many Inbuilt methods are already present in the String class to make
         * developer life easier.
         * 
         * 1)concat("content" / reference variable) :- Used for joining two strings
         * 
         * 2)equals(reference variable or object) :- Used to compare contents of two
         * strings also their cases
         * 
         * 3)charAt( index ) :- Gives the character present at requested index
         * 
         * 4)equalsIgnoreCase(reference variable or object) :- Used to compare contents
         * of two string ignoring the cases i.e. upper or lower
         * 
         * 5)substring() :- gives a part of string starting from given index to the end
         * of string
         * 
         * 6)substring(int begin , int end) :- gives a part of string starting from
         * begin index to the given end index
         * 
         * 7)length() :- gives the length of string including spaces
         * 
         * 8)indexOf(character) :- Gives index position of req character present in the
         * string on first occurence basis
         * 
         * 9)lastIndexof(character) :- gives index position of req character present in
         * string on last occurence basis
         * 
         */

        String s1 = "Shorya Rastogi";
        System.out.println(s1.length());
        System.out.println(s1.indexOf('o'));
        System.out.println(s1.substring(7, 14));
        System.out.println(s1.charAt(7));
    }
}
