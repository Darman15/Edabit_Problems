package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr = {5,7,9,12};

        System.out.println(minimumRemovals(arr));
    }

    public static int minimumRemovals(int[] arr) {
        int answer = 0;
        for(int i = 0; i < arr.length; i++) {
            answer = answer + arr[i];
        }
        if (answer % 2 != 0) {
            return 1;
        }
        return 0;

    }
}
