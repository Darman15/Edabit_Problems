package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arrayTest = {1,1,1,1};

        System.out.println(Arrays.toString(additiveInverse(arrayTest)));
    }

    public static int[]additiveInverse(int[] arr) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                answer[i] = arr[i] + (-arr[i] * 2);
            } else {
                answer[i] = arr[i] + (-arr[i] * 2);
            }
        }
        return answer;
    }
}
