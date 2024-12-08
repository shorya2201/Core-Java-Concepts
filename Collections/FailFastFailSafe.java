package Collections;

import java.util.ArrayList;

public class FailFastFailSafe {
    // FAIL FAST
    /*
     * 
     */

    // FAIL SAFE
    /*
     * 
     */
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
            al.add(10);// COncurrent
        }
    }
}
