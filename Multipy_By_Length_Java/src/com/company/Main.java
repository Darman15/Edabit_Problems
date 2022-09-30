package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {4,1,1,};

        System.out.println(Arrays.toString(MultipyByLenght(arr)));
    }

    public static int[] MultipyByLenght(int[] arr) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i] * arr.length;
        }
        return answer;
    }
}
