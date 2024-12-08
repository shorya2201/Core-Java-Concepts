package Interfaces;

import java.util.*;
import java.io.*;

public class Solution {
    public static int findInteger(int n, int k) {

        ArrayList al = new ArrayList();
        // Arraylist result = new ArrayList();
        ArrayList even = new ArrayList();
        ArrayList odd = new ArrayList();

        for (int i = 1; i <= n; i++) {
            al.add(i);
        }

        for (int i = 0; i < al.size(); i++) {
            if (((Integer) al.get(i)) % 2 == 0) {
                even.add(al.get(i));
            } else {
                odd.add(al.get(i));
            }
        }

        odd.addAll(even);

        int key = (Integer) odd.get(k);
        System.out.println(odd);
        return key;

    }

    public static void main(String[] args) {
        System.out.println(findInteger(7, 4));

    }
}
