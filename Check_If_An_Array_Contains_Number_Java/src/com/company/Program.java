package com.company;

public class Program {

    public static boolean check(int[] arr, int el) {
        for(int i: arr) {
            if (i == el) {
                return true;
            }
        }
        return false;
    }
}
