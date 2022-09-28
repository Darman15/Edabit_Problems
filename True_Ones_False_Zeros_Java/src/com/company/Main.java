package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(integerBoolean("0110")));
    }

    public static boolean[] integerBoolean(String bits) {
        boolean[] arr = new boolean[bits.length()];
        for (int i = 0; i < bits.length(); i++) {
            if (bits.charAt(i) == '0') {
                arr[i] = false;
            }
            else if (bits.charAt(i) == '1') {
                arr[i] = true;
            }
        }
        return arr;
    }
}
