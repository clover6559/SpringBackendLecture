package org.example.head02_JAVA;

import java.util.Arrays;

public class DeepCopyArraySystem {
    public static void main(String[] args) {
        int [] original = {1, 2, 3};
        int [] copy = new int [original.length];
        System.arraycopy(original,1, copy,0, 2);
        System.out.println("original = " + Arrays.toString(original));
        System.out.println("copy = " + Arrays.toString(copy));
    }
}
