public class reverseString {
    public static void main(String[] args) {
        // reverse every character in string not preserving the word order
        String s1 = "waterwell engineering";
        String s2 = " ";
        System.out.println("Before Reversing : " + s1);
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }

        System.out.println("After Reversing : " + s2);

        // reverse every word of string not reversing the character order

        String str1 = "sandeep singh rastogi";
        String str2 = " ";
        System.out.println("Before Reversing : " + str1);
        String sarr[] = str1.split(" ");
        for (int i = sarr.length - 1; i >= 0; i--) {
            str2 = str2 + " " + sarr[i];
        }
        System.out.println(" After Reversing : " + str2);

        // Reverse every character of string while also preserving word order

        String ss1 = "diya rastogi";
        String ss2 = " ";

        System.out.println("Before Reversing : " + ss1);

        String ssarr[] = ss1.split(" ");

        for (String elem : ssarr) {
            for (int i = elem.length() - 1; i >= 0; i--) {
                ss2 = ss2 + elem.charAt(i);
            }
            ss2 = ss2 + " ";
        }
        System.out.println("After Reversing : " + ss2);
    }
}
