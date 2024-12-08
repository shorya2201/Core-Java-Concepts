public class pangram {
    public static void main(String[] args) {

        // Pangram is a program which contains every alphabet of english

        String str = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";

        str = str.replace(" ", "");

        // Create a char array to store characters of string

        char ch[] = str.toCharArray();

        // Create a int array of total alphabets lenght

        int ar[] = new int[26];

        // traverse through characters of string and everytime we found a character
        // increament the value of ar[] array at that index

        for (int i = 0; i < ch.length; i++) {
            ar[ch[i] - 65]++;// we take 65 because capital alphabets starts from 65 in ASCII coding
        }

        // if every characters are present in the string then value of every ar[i] index
        // will be non zero

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != 0) {
                System.out.println("It is a Pangram");
                break;
            }
        }
    }
}
