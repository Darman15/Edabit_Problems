package com.company;

public class Main {

    public static void main(String[] args) {

        int[] jumps = {1, 2, 3, 4, 5};

        System.out.println(hurdleJump(jumps, 5));

    }

    public static boolean hurdleJump(int[] hurdles, int h) {
        for(int i = 0; i < hurdles.length; i++) {
            if (h < hurdles[i]) {
                return false;
            }
        }
        return true;
    }
}
