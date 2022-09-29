package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] testArray = {};

        System.out.println(sumOfCubes(testArray));
    }

    public static int sumOfCubes(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer = answer + (int) (Math.pow(arr[i], 3));
        }
        return answer;
    }

}
