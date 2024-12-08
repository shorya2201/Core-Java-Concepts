import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {

        // Anagram are words which contains same letter in same repetition but arranged
        // differently

        String str1 = "School Master";
        String str2 = "The Classroom";

        // Remove Whitespaces

        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        // Convert it to lowercase

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Store every character in an char array

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        // Sort the arrays using inbuilt function

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare using Arrays equals method and if-else

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Given strings are Anagram!!");
        } else {
            System.out.println("Given strings are not an Anagram");
        }

    }
}
