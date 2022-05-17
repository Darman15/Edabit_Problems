package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr = {-3, 0, 8, -6};

        System.out.println(indexMultiplier(arr));
    }

    public static int indexMultiplier(int[] arr) {

        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i] * i;
        }
     return sum;
    }
}
