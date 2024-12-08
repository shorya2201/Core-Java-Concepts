import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        // Palindrome is a word which is read same no matter from where we start(forward
        // or
        // backward)

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word you want to check:");
        String word = sc.nextLine();

        String result = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            result = result + word.charAt(i);
        }

        if (result.equalsIgnoreCase(word)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }

    }
}
