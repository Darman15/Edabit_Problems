package com.company;

public class Main {

    public static void main(String[] args) {

        int[] intArr = {3,6};

        System.out.println(checkFactors(intArr, 9));
    }

    public static boolean checkFactors(int[] factors, int num) {

        for (int i = 0; i < factors.length; i++) {
            System.out.println(num % factors[i]);
            System.out.println(factors[i]);
            if (num % factors[i] != 0) {
                return false;
            }

        }
        return true;
    }
}
