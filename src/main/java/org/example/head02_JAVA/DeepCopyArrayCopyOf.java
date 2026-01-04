package org.example.head02_JAVA;

import java.util.Arrays;

public class DeepCopyArrayCopyOf {
    public static void main(String[] args) {
        int[] original = {1,2,3};
        int [] copy = Arrays.copyOf(original,original.length);
        copy[0] = 100;
        System.out.println("original = " + Arrays.toString(original));
        System.out.println("copy = " + Arrays.toString(copy));
    }
}
