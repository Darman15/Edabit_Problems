package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr = {2, -1, 4, 8, 10};
        System.out.println(getAbsSum(arr));

    }

    public static int getAbsSum(int[] arr) {
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
           answer = answer + Math.abs(arr[i]);
        }
        return answer;
    }
}
