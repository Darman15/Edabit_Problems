package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(transform(intArray)));


    }

    public static int[] transform(int[] arr) {
        int[] answer = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                answer[i] = arr[i] -1;
            }
            else {
                answer[i] = arr[i] + 1;
            }
        }
        return answer;
    }
}
